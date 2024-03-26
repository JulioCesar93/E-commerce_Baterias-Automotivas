package com.jcs.BateriaStore.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_profile")
public class Profile implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;

}