package com.example.springpro.Repository;
import com.example.springpro.Entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer>{
}
