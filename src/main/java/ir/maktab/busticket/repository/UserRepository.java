package ir.maktab.busticket.repository;

import ir.maktab.busticket.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsUserByUsernameAndPassword(String username, String password);

    User findUserByUsername(String username);
}
