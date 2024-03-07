package com.jcs.BateriaStore.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Produto {

    private Long id;
    private Categoria categoria;
    private String sku; //peso
    private String name;
    private String description;
    private BigDecimal unitPrice;
    private String imageUrl;
    private Boolean favorite;
    private Integer unitsInStock;
    private Date dateCreated;
    private Date lastUpdated;
}
