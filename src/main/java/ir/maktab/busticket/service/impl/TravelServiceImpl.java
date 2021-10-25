package ir.maktab.busticket.service.impl;

import ir.maktab.busticket.repository.TravelRepository;
import ir.maktab.busticket.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TravelServiceImpl implements TravelService {

    @Autowired
    TravelRepository travelRepository;
}
