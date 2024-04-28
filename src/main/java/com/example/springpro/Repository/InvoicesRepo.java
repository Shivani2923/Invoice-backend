package com.example.springpro.Repository;

import com.example.springpro.Entity.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface InvoicesRepo extends JpaRepository<Invoices,Integer> {
    }

