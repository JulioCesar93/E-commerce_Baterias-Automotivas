package com.jcs.BateriaStore.entities;

import lombok.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
public class Category implements Serializable {

    private Long id;
    private String name;
    private Set<Product> products;
}
