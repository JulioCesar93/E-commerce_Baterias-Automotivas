package com.jcs.BateriaStore.entities;

import jakarta.persistence.*;
import java.time.Instant;

public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "HORÁRIO DIVERGENTE")
    private Instant moment;

    @OneToOne
    private Order order;

    public Payment(){}

}
