package com.jcs.BateriaStore.dtos;

import com.jcs.BateriaStore.entities.Product;

import java.math.BigDecimal;
import java.util.Date;

public class ProductDto {

    private Long id;
    private String sku; //peso
    private String name;
    private String description;
    private BigDecimal unitPrice;
    private String imageUrl;
    private boolean favorite;
    private int unitsInStock;
    private Date dateCreated;
    private Date lastUpdated;
    private CategoryDto category;

    public ProductDto(Product entity) {}
}

