package com.example.springpro.Repository;
import com.example.springpro.Entity.Invoiceitem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceitemRepo extends JpaRepository<Invoiceitem,Integer>{
}


