package com.jcs.BateriaStore.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "state")
public class State implements Serializable {

    @Id
    private Long id;
    private String name;
    private Country country;
}
