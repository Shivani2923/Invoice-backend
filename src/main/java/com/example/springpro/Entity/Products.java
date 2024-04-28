package com.example.springpro.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name="Products_DB")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Products{
    @Id
    @Column(name = "Product_ID")
    @GeneratedValue
    private int ID;

    @Column(name = "Product_Name")
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "Price")
    private int price;

}
