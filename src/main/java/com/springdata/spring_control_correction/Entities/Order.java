package com.springdata.spring_control_correction.Entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nOrder;
    @Column
    private String paymentmethod;
    @Column
    private Double amount;
    @Column
    private int Quantity;
    @Column
    private String description;
    @Column
    private Date orderdate;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CIN", nullable = false)
    private Client client;
}
