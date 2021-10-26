package ir.maktab.busticket.service;

import ir.maktab.busticket.model.Customer;
import ir.maktab.busticket.model.Ticket;

import java.util.List;

public interface TicketService {

    Ticket save(Ticket ticket);

    Ticket findById(Long id);

    void delete(Ticket ticket);

    List<Ticket> findByCustomer(Customer customer);
}
