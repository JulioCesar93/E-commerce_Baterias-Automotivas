package com.jcs.BateriaStore.dtos;

import com.jcs.BateriaStore.entities.Category;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class CategoryDto implements Serializable {

    private Long id;
    private String name;

    public CategoryDto(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
