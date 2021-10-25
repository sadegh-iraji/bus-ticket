package ir.maktab.busticket.controller;

import ir.maktab.busticket.model.Admin;
import ir.maktab.busticket.model.enumeration.UserType;
import ir.maktab.busticket.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/adminCheck")
    public String adminCheck(){
        if (!adminService.existById(1L)){
            Admin admin = new Admin("admin", "admin", "admin@maktab.ir",UserType.ADMIN);
            adminService.save(admin);
        }
        return "redirect:/signUp";
    }
}
