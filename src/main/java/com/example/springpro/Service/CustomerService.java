package com.example.springpro.Service;

import com.example.springpro.Entity.Customer;
import com.example.springpro.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {


    @Autowired
    private CustomerRepo customerRepo;
    public Customer saveDetails(Customer customer) {

        return customerRepo.save(customer);
    }

}

