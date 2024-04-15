package com.jcs.BateriaStore.controllers;

import com.jcs.BateriaStore.dtos.CountryDto;
import com.jcs.BateriaStore.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping
    public ResponseEntity<List<CountryDto>> findAll() {
        List<CountryDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CountryDto> findById(@PathVariable Long id) {
        CountryDto dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }
}