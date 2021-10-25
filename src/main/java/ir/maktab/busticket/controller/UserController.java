package ir.maktab.busticket.controller;

import ir.maktab.busticket.model.User;
import ir.maktab.busticket.service.UserService;
import ir.maktab.busticket.util.SecurityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/signIn")
    public String signIn(){
        return "signIn";
    }

    @PostMapping("/signInConfirm")
    public String signInConfirm(@RequestParam String username,
                                @RequestParam String password) {
        if (!userService.existByUsernameAndPassword(username, password)) {
            return "noUserFound";
        } else {
            User activeUser = userService.findUesrByUsername(username);
            SecurityContext.setActiveUser(activeUser);
        }
        return "redirect:/userSwitchMenu";
    }

    @GetMapping("/userSwitchMenu")
    public String userSwitchMenu(){
        switch (SecurityContext.getActiveUser().getUserType()){
            case ADMIN:
                return "adminMenu";
            case CUSTOMER:
                return "customerMenu";
        }
        return "";
    }

    @GetMapping("/logOut")
    public String logOut(){
        SecurityContext.logOut();
        return "redirect:/";
    }
}
