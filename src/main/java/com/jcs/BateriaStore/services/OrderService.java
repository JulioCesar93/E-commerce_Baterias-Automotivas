package com.jcs.BateriaStore.services;

import com.jcs.BateriaStore.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
}
