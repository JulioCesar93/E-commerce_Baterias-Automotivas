package com.jcs.BateriaStore.entities;

import java.io.Serializable;
import java.util.List;

public class Country implements Serializable {

    private Long id;
    private String code;
    private String name;
    private List<State> states;
}
