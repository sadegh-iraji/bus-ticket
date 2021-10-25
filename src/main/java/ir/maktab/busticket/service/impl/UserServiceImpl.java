package ir.maktab.busticket.service.impl;

import ir.maktab.busticket.repository.UserRepository;
import ir.maktab.busticket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
}
