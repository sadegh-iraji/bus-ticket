package ir.maktab.busticket.controller;

import ir.maktab.busticket.model.Customer;
import ir.maktab.busticket.model.Ticket;
import ir.maktab.busticket.model.enumeration.City;
import ir.maktab.busticket.model.enumeration.UserType;
import ir.maktab.busticket.service.CustomerService;
import ir.maktab.busticket.util.SecurityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/signUp")
    public String signUp(){
        return "signUp";
    }

    @PostMapping("/signUpConfirm")
    public String signUpConfirm(@RequestParam String username,
                                @RequestParam String password,
                                @RequestParam String email){
        try {
            Customer customer = new Customer(username, password, email, UserType.CUSTOMER);
            customerService.save(customer);
        } catch (Exception e){
            e.printStackTrace();
        }
        return "signUpConfirm";
    }

    @GetMapping("/customerMenu")
    public String customerMenu(){
        return "customerMenu";
    }

    @GetMapping("/reservedTickets")
    public String reservedTickets(ModelMap modelMap){

        Customer customer = (Customer) SecurityContext.getActiveUser();
        List<Ticket> ticketList = customer.getTickets();

        if (ticketList.isEmpty()){
            return "noTicketsReserved";
        }

        modelMap.addAttribute("ticketList", ticketList);
        return "reservedTickets";
    }


}
