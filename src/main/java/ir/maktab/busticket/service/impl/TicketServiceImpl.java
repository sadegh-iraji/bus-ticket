package ir.maktab.busticket.service.impl;

import ir.maktab.busticket.repository.TicketRepository;
import ir.maktab.busticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;
}
