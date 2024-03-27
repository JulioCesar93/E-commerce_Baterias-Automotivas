package com.jcs.BateriaStore.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

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

    //Mapear user e Profile
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tb_user_profile",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "profile_id"))
    private Set<Profile> profile = new HashSet<>();

    //Endereço-Cliente
    @OneToMany(mappedBy = "user")
    public List<Endereco> enderecoList = new ArrayList<>();


}
        