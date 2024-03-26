package com.jcs.BateriaStore.entities;

import com.jcs.BateriaStore.entities.enums.StatusOrder;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "HORÁRIO DIVERGENTE")
    private Instant moment;
    private StatusOrder status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @OneToOne(mappedBy = "order")
    private Payment payment;

    @OneToMany(mappedBy = "id.order")
    private Set<OrderItem> items = new HashSet<>();

    public Order(){}
}
