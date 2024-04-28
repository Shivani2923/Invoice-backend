package com.example.springpro.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor ;

@Entity
@Data
@Table(name="Invoices_DB")
@NoArgsConstructor
@AllArgsConstructor

public class Invoices{
    @Id
    @Column(name = "Invoices_ID")
    @GeneratedValue
    private int invoices_id;

    @ManyToOne
    private Customer C_Id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Contact_no")
    private int contact_no;

    @Column(name = "Address")
    private String address;
}

