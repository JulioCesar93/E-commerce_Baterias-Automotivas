package com.jcs.BateriaStore.services.validation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//(url="viacep.com.br/ws/", name="viacep")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    EnderecoDto findByCep(@PathVariable("cep") String cep);
}