package com.jcs.BateriaStore.controllers.exceptions;

import com.jcs.BateriaStore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
}
