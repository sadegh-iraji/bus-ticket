package ir.maktab.busticket.service.impl;

import ir.maktab.busticket.model.Travel;
import ir.maktab.busticket.model.enumeration.City;
import ir.maktab.busticket.repository.TravelRepository;
import ir.maktab.busticket.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TravelServiceImpl implements TravelService {

    @Autowired
    TravelRepository travelRepository;

    @Override
    public Travel save(Travel travel) {
        return travelRepository.save(travel);
    }

    @Override
    public List<Travel> findByOriginAndDestinationAndDate(City origin, City destination, LocalDate date) {
        return travelRepository.findByOriginAndDestinationAndDate(origin, destination, date);
    }

    @Override
    public Travel findById(Long id) {
        return travelRepository.findById(id).orElse(null);
    }


}
