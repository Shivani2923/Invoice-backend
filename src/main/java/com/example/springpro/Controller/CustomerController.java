package com.example.springpro.Controller;
import com.example.springpro.Entity.Customer;
import com.example.springpro.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {



    @Autowired
   private CustomerService customerService;
    @PostMapping("/addCustomer")

    public Customer postDetails(@RequestBody Customer customer)
    {
       return customerService.saveDetails(customer);
    }

}
