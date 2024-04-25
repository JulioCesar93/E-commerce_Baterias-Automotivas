package com.jcs.BateriaStore.controllers;

import com.jcs.BateriaStore.dtos.EnderecoDto;
import com.jcs.BateriaStore.services.EnderecoService;
import com.jcs.BateriaStore.services.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    //consulta por cep
    @GetMapping("/viacep/{cep}")
    public ResponseEntity<EnderecoDto> consultaCep(@PathVariable String cep) {
        EnderecoDto dto = viaCepService.findByCep(cep);
        return ResponseEntity.ok().body(dto);
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

    @PostMapping
    public ResponseEntity<EnderecoDto> insert(@RequestBody EnderecoDto dto) {
        EnderecoDto newDto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(newDto.getId()).toUri();
        return ResponseEntity.created(uri).body(newDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EnderecoDto> update(@PathVariable Long id, @RequestBody EnderecoDto dto) {
        EnderecoDto newDto = service.update(id, dto);
        return ResponseEntity.ok().body(newDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}