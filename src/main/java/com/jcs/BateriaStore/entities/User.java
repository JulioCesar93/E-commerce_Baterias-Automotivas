package com.jcs.BateriaStore.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String cpf;
    private String phone;

    @Column(name = "birth_day")
    private LocalDate birthDay;
    @Column(unique = true)
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    public List<Endereco> enderecoList = new ArrayList<>();

}
        