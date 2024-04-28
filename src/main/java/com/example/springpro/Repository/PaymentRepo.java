package com.example.springpro.Repository;

import com.example.springpro.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;




    public interface PaymentRepo extends JpaRepository<Payment,Integer> {
    }

