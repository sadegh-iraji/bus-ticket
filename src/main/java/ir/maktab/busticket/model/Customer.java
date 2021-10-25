package ir.maktab.busticket.model;

import ir.maktab.busticket.model.enumeration.UserType;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer extends User {

    @OneToMany(mappedBy = "customer", cascade = CascadeType.MERGE)
    private List<Ticket> tickets = new ArrayList<>();

    public Customer() {
    }

    public Customer(String username, String password, String email, UserType userType) {
        super(username, password, email, userType);
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
