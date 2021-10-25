package ir.maktab.busticket.model;

import ir.maktab.busticket.model.base.BaseEntity;
import ir.maktab.busticket.model.enumeration.UserType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public class User extends BaseEntity<Long> {

    private String username;

    private String password;

    private String email;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    public User() {
    }

    public User(String username, String password, String email, UserType userType) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
