package ir.maktab.busticket.service;

import ir.maktab.busticket.model.Travel;
import ir.maktab.busticket.model.enumeration.City;

import java.time.LocalDate;
import java.util.List;

public interface TravelService {

    Travel save(Travel travel);

    List<Travel> findByOriginAndDestinationAndDate(City origin, City destination, LocalDate date);

    Travel findById(Long id);
}
