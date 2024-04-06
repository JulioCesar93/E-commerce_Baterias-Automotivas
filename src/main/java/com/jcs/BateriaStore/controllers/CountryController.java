package com.jcs.BateriaStore.controllers;

import com.jcs.BateriaStore.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private CountryService service;
}

// @GetMapping
// @GetMapping busca por ID