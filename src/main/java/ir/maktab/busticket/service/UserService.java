package ir.maktab.busticket.service;

import ir.maktab.busticket.model.User;

public interface UserService {

    boolean existByUsernameAndPassword(String username, String Password);

    User findUesrByUsername(String username);
}
