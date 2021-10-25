package ir.maktab.busticket.service.impl;

import ir.maktab.busticket.repository.AdminRepository;
import ir.maktab.busticket.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

}
