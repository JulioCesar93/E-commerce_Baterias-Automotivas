package com.jcs.BateriaStore.services;

import com.jcs.BateriaStore.repositories.CategoryRepository;
import com.jcs.BateriaStore.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private CategoryRepository categoryRepository;
}
