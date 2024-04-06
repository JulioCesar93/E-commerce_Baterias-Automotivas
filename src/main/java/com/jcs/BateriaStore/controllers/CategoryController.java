package com.jcs.BateriaStore.controllers;

import com.jcs.BateriaStore.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;
}

// @GetMapping
// @PostMapping
// @PutMapping(value = "/{id}")
// @DeleteMapping(value = "/{id}")