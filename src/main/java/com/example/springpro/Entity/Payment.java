package com.example.springpro.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Data
@Table(name="Payment_DB")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Payment{
    @Id
    @Column(name = "Payment_ID")
    @GeneratedValue
    private int Payment_ID;

   @ManyToOne
   private Invoices Invoices_Id;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Amount")
    private int amount;

    @Column(name = "Payment_Method")
    private int payment_method;

    @Column(name = "Transaction_Id")
    private int transaction_id;
}

