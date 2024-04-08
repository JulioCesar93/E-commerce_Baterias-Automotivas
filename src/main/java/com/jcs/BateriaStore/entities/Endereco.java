package com.jcs.BateriaStore.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "tb_endereco")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Endereco implements Serializable {

    private Long id;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

