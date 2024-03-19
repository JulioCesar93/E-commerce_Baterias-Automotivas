package com.jcs.BateriaStore.controllers.exceptions;

import com.jcs.BateriaStore.services.EnderecoService;
import com.jcs.BateriaStore.services.ViaCepService;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/endereco")
public class EnderecoController {

    private EnderecoService service;
    private ViaCepService viaCepService;
}
