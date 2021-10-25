package ir.maktab.busticket.service.impl;

import ir.maktab.busticket.model.Customer;
import ir.maktab.busticket.repository.CustomerRepository;
import ir.maktab.busticket.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
