package com.jcs.BateriaStore.entities;

import com.jcs.BateriaStore.entities.Pgto.OrderProdPgto;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem {

    private Integer quantity;
    private Double price;

    @EmbeddedId
    private OrderProdPgto id = new OrderProdPgto();

    public OrderItem() {}
}
