package ir.maktab.busticket.model;

import ir.maktab.busticket.model.enumeration.UserType;

public class Admin extends User{

    public Admin() {
    }

    public Admin(String username, String password, String email, UserType userType) {
        super(username, password, email, userType);
    }
}
