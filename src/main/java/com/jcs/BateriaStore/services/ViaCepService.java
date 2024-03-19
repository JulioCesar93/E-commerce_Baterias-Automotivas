package com.jcs.BateriaStore.services;

import com.jcs.BateriaStore.dtos.EnderecoDto;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url="viacep.com.br/ws/", name="viacep") -> busca CEP
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    EnderecoDto findByCep(@PathVariable("cep") String cep);
}