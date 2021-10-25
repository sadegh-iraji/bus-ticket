package ir.maktab.busticket.model;

import ir.maktab.busticket.model.base.BaseEntity;
import ir.maktab.busticket.model.enumeration.Gender;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Ticket extends BaseEntity<Long> {

    private String travellerName;

    private Gender travellerGender;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Travel travel;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Customer customer;

    public Ticket() {
    }

    public Ticket(String travellerName, Gender travellerGender, Travel travel, Customer customer) {
        this.travellerName = travellerName;
        this.travellerGender = travellerGender;
        this.travel = travel;
        this.customer = customer;
    }

    public String getTravellerName() {
        return travellerName;
    }

    public void setTravellerName(String travellerName) {
        this.travellerName = travellerName;
    }

    public Gender getTravellerGender() {
        return travellerGender;
    }

    public void setTravellerGender(Gender travellerGender) {
        this.travellerGender = travellerGender;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
