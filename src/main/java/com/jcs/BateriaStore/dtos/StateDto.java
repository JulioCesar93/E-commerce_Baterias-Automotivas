package com.jcs.BateriaStore.dtos;

import com.jcs.BateriaStore.entities.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StateDto implements Serializable {

    private Long id;
    private String name;
    private Long countryId;

    public StateDto(State entity) {
        id = entity.getId();
        name = entity.getName();
        countryId = entity.getCountry().getId();
    }
}