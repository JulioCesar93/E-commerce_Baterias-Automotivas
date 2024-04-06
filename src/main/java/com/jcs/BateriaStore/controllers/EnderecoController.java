package com.jcs.BateriaStore.controllers;

import com.jcs.BateriaStore.dtos.EnderecoDto;
import com.jcs.BateriaStore.services.EnderecoService;
import com.jcs.BateriaStore.services.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService service;
    @Autowired
    private ViaCepService viaCepService;

    //busca todos os endereços
    @GetMapping
    public ResponseEntity<List<EnderecoDto>> findAll() {
        List<EnderecoDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    //busca endereco pelo id do usurio => /find?userId=2
    @GetMapping("/find")
    public ResponseEntity<List<EnderecoDto>> getByUserId(@RequestParam("userId") Long userId) {
        List<EnderecoDto> list = service.getByUserId(userId);
        return ResponseEntity.ok().body(list);
    }

    //busca endereco por id
    @GetMapping("/{id}")
    public ResponseEntity<EnderecoDto> findById(@PathVariable Long id) {
        EnderecoDto dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }
}

//Add Busca por id: Get, Put, Post e Delete