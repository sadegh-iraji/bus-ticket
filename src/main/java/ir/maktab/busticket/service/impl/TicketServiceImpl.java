package ir.maktab.busticket.service.impl;

import ir.maktab.busticket.model.Ticket;
import ir.maktab.busticket.repository.TicketRepository;
import ir.maktab.busticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket findById(Long id) {
        return ticketRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Ticket ticket) {
        ticketRepository.delete(ticket);
    }
}
