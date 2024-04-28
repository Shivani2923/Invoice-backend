package com.example.springpro.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor ;

@Entity
@Data
@Table(name="Invoiceitem_DB")
@NoArgsConstructor
@AllArgsConstructor

public class Invoiceitem {
    @Id
    @Column(name = "Invoiceitem_ID")
    @GeneratedValue
    private int invoiceitem_id;

    @ManyToOne
    private Invoices Invoices_Id;

    @ManyToOne
    private Products Product_Id;

    @Column(name = "Quantity")
    private String name;

    @Column(name = "Unit_price")
    private int contact_no;

    @Column(name = "Total_Price")
    private String address;
}


