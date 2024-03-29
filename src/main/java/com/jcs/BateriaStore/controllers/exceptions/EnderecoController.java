package com.jcs.BateriaStore.controllers.exceptions;

import com.jcs.BateriaStore.services.EnderecoService;
import com.jcs.BateriaStore.services.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService service;
    @Autowired
    private ViaCepService viaCepService;
}

//Add Get Mapping - consulta por cep
//Add Get, Put, Post e Delete