package ir.maktab.busticket.service;

import ir.maktab.busticket.model.Travel;

import java.time.LocalDate;
import java.util.List;

public interface TravelService {

    Travel save(Travel travel);

    List<Travel> findByOriginAndDestinationAndDate(String origin, String destination, LocalDate date);

    Travel findById(Long id);
}
