package ir.maktab.busticket.model;

import ir.maktab.busticket.model.base.BaseEntity;
import ir.maktab.busticket.model.enumeration.City;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Travel extends BaseEntity<Long> {

    @Enumerated(EnumType.STRING)
    private City origin;

    @Enumerated(EnumType.STRING)
    private City destination;

    @FutureOrPresent(message = "Travel can't set for past days ! ")
    private LocalDate date;

    private LocalTime time;

    @OneToMany(mappedBy = "travel", cascade = CascadeType.MERGE)
    private List<Ticket> tickets = new ArrayList<>();

    public Travel() {
    }

    public Travel(City origin, City destination, LocalDate date, LocalTime time) {
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.time = time;
    }

    public City getOrigin() {
        return origin;
    }

    public void setOrigin(City origin) {
        this.origin = origin;
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

}
