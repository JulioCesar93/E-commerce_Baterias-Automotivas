package com.jcs.BateriaStore.entities;

import com.jcs.BateriaStore.entities.enums.StatusOrder;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Order {

    private Long id;
    private Instant moment;
    private StatusOrder status;
    private User client;
    private Payment payment;
    private Set<OrderItem> items = new HashSet<>();

    public Order(){
    }
}
