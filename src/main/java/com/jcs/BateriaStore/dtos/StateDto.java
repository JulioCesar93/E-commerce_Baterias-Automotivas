package com.jcs.BateriaStore.dtos;

import com.jcs.BateriaStore.entities.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StateDto {

    private Long id;
    private String name;
    private Long countryId;

    public StateDto(State entity) {
        id = entity.getId();
        name = entity.getName();
        countryId = entity.getCountry().getId();
    }
}


