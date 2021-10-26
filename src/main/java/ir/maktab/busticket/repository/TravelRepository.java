package ir.maktab.busticket.repository;

import ir.maktab.busticket.model.Travel;
import ir.maktab.busticket.model.enumeration.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface TravelRepository extends JpaRepository<Travel, Long> {

    List<Travel> findByOriginAndDestinationAndDate(City origin, City destination, LocalDate date);
}
