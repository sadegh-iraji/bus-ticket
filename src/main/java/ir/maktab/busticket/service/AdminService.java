package ir.maktab.busticket.service;

import ir.maktab.busticket.model.Admin;
import ir.maktab.busticket.model.enumeration.UserType;

public interface AdminService {

    Admin save(Admin admin);

    boolean existById(Long id);
}
