package com.example.springpro.Repository;

import com.example.springpro.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepo extends JpaRepository<Products,Integer> {
    }

