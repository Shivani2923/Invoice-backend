package com.example.springpro.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name="Customer")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Customer {
    @Id
    @Column(name = "C_ID")
    @GeneratedValue
    private int c_id;

    @Column(name = "C_Name")
    private String name;

    @Column(name = "Contact_no")
    private int contact_no;

    @Column(name = "Address")
    private String address;
    
}
