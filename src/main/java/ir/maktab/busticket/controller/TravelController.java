package ir.maktab.busticket.controller;

import ir.maktab.busticket.model.Travel;
import ir.maktab.busticket.model.enumeration.City;
import ir.maktab.busticket.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class TravelController {

    @Autowired
    TravelService travelService;

    @GetMapping("/searchTravels")
    public String searchTicket(ModelMap modelMap){
        City[] cities = City.values();
        modelMap.addAttribute("cities", cities);
        return "searchTravels";
    }

    @GetMapping("/existTravel")
    public String existTicket(@RequestParam String origin,
                              @RequestParam String destination,
                              @RequestParam String date,
                              ModelMap modelMap){
        LocalDate localDate = LocalDate.parse(date);
        List<Travel> travels = travelService.findByOriginAndDestinationAndDate(origin,destination,localDate);
        if (travels.isEmpty()){
            return "noTravelAvailable";
        }
        modelMap.addAttribute("travels", travels);
        modelMap.addAttribute("origin", origin);
        modelMap.addAttribute("destination", destination);
        modelMap.addAttribute("localDate", localDate);
        return "showAvailableTravels";
    }
}
