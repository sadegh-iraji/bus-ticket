package ir.maktab.busticket.service;

import ir.maktab.busticket.model.Ticket;

public interface TicketService {

    Ticket save(Ticket ticket);

    Ticket findById(Long id);

    void delete(Ticket ticket);
}
