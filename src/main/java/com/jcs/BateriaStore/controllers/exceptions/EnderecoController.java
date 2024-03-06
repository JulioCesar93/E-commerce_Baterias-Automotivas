package com.jcs.BateriaStore.controllers.exceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/endereco")
public class EnderecoController {

    private AddressService service;
    private ViaCepService viaCepService;
}
