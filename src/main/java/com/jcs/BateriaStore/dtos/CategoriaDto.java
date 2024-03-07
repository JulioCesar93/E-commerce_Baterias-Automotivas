package com.jcs.BateriaStore.dtos;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class CategoriaDto  implements Serializable {

    private Long id;
    private String name;

    public CategoriaDto(Categoria entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
