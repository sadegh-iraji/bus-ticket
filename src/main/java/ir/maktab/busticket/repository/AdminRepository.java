package ir.maktab.busticket.repository;

import ir.maktab.busticket.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
