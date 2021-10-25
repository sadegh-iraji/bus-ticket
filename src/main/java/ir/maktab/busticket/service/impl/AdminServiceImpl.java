package ir.maktab.busticket.service.impl;

import ir.maktab.busticket.model.Admin;
import ir.maktab.busticket.repository.AdminRepository;
import ir.maktab.busticket.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public Admin save(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public boolean existById(Long id) {
        return adminRepository.existsById(id);
    }
}
