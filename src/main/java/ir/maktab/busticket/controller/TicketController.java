package ir.maktab.busticket.controller;

import ir.maktab.busticket.model.Customer;
import ir.maktab.busticket.model.Ticket;
import ir.maktab.busticket.model.Travel;
import ir.maktab.busticket.model.enumeration.Gender;
import ir.maktab.busticket.service.TicketService;
import ir.maktab.busticket.service.TravelService;
import ir.maktab.busticket.util.SecurityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TicketController {

    @Autowired
    TicketService ticketService;

    @Autowired
    TravelService travelService;

    @PostMapping("/ticketInformation")
    public String ticketInformation(@RequestParam String id,
                                    ModelMap modelMap) {
        long travelId = Long.parseLong(id);
        modelMap.addAttribute("male", Gender.MALE);
        modelMap.addAttribute("female", Gender.FEMALE);
        modelMap.addAttribute("travelId", travelId);
        return "ticketInformation";
    }

    @PostMapping("/reserveConfirm")
    public String reserveConfirm(@RequestParam String travellerName,
                                 @RequestParam String gender,
                                 @RequestParam String travelId,
                                 ModelMap modelMap) {

        Travel travel = travelService.findById(Long.parseLong(travelId));
        Customer customer = (Customer) SecurityContext.getActiveUser();
        Ticket ticket = new Ticket(travellerName, Gender.valueOf(gender), travel, customer);
        ticketService.save(ticket);
        modelMap.addAttribute("gender", gender);
        modelMap.addAttribute("ticket", ticket);
        return "reserveConfirm";
    }

    @PostMapping("/showTicketDetails")
    public String showTicketDetails(@RequestParam String id,
                                    ModelMap modelMap) {

        Ticket ticket = ticketService.findById(Long.parseLong(id));
        Travel ticketTravel = ticket.getTravel();
        modelMap.addAttribute("ticket", ticket);
        modelMap.addAttribute("ticketTravel", ticketTravel);

        return "showTicketDetails";
    }

    @PostMapping("ticketCancel")
    public String ticketCancel(@RequestParam String id) {
        Ticket ticket = ticketService.findById(Long.parseLong(id));
        ticketService.delete(ticket);
        return "ticketCancel";
    }

    @GetMapping("/reservedTickets")
    public String reservedTickets(ModelMap modelMap) {

        Customer customer = (Customer) SecurityContext.getActiveUser();

        List<Ticket> ticketList = ticketService.findByCustomer(customer);

        if (ticketList.isEmpty()) {
            return "noTicketsReserved";
        }

        modelMap.addAttribute("ticketList", ticketList);
        return "reservedTickets";
    }
}
