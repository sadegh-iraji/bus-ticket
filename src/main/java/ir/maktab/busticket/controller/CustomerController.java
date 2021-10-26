package ir.maktab.busticket.controller;

import ir.maktab.busticket.model.Customer;
import ir.maktab.busticket.model.enumeration.UserType;
import ir.maktab.busticket.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;

@Controller
@Transactional
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/signUp")
    public String signUp() {
        return "signUp";
    }

    @PostMapping("/signUpConfirm")
    public String signUpConfirm(@RequestParam String username,
                                @RequestParam String password,
                                @RequestParam String email) {
        try {
            Customer customer = new Customer(username, password, email, UserType.CUSTOMER);
            customerService.save(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "signUpConfirm";
    }

    @GetMapping("/customerMenu")
    public String customerMenu() {
        return "customerMenu";
    }


}
