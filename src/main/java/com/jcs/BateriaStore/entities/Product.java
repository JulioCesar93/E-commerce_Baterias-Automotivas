package com.jcs.BateriaStore.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

    private Long id;
    private String name;
    private Category category;
    private String sku; //peso
    private String description;
    private BigDecimal unitPrice;
    private String imageUrl;
    private Boolean favorite;
    private Integer unitsInStock;
    private Date dateCreated;
    private Date lastUpdated;
}
