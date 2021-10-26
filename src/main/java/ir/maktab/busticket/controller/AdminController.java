package ir.maktab.busticket.controller;

import ir.maktab.busticket.model.Admin;
import ir.maktab.busticket.model.enumeration.City;
import ir.maktab.busticket.model.enumeration.UserType;
import ir.maktab.busticket.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/adminCheck")
    public String adminCheck() {
        if (!adminService.existById(1L)) {
            Admin admin = new Admin("admin", "admin", "admin@maktab.ir", UserType.ADMIN);
            adminService.save(admin);
        }
        return "redirect:/signUp";
    }

    @GetMapping("/adminMenu")
    public String adminMenu() {
        return "adminMenu";
    }

    @GetMapping("/addTravel")
    public String addTravel(ModelMap modelMap) {
        City[] cities = City.values();
        modelMap.addAttribute("cities", cities);
        return "addTravel";
    }
}
