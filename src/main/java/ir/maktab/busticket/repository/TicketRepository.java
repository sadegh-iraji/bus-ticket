package ir.maktab.busticket.repository;

import ir.maktab.busticket.model.Customer;
import ir.maktab.busticket.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findByCustomer(Customer customer);

}
