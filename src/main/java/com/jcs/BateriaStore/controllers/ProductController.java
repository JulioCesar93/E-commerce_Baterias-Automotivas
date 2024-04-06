package com.jcs.BateriaStore.controllers;

import com.jcs.BateriaStore.dtos.ProductDto;
import com.jcs.BateriaStore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping
    public ResponseEntity<List<ProductDto>> findAll() {
        return null;
    }
}
