package com.jcs.BateriaStore.dtos;

import com.jcs.BateriaStore.entities.Country;

import java.io.Serializable;

public class CountryDto implements Serializable {
    private Long id;
    private String code;
    private String name;

    public CountryDto (Country entity) {
        id = entity.getId();
        code = entity.getCode();
        name = entity.getName();
    }
}
