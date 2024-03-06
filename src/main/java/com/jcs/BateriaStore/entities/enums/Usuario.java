package com.jcs.BateriaStore.entities.enums;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private Long id;
    private String firstName;
    private String lastName;
    private String cpf;
    private String phone;
    private LocalDate birthDay;
    private String email;
    private String password;
    public List<Endereco> enderecoList = new ArrayList<>();
}
