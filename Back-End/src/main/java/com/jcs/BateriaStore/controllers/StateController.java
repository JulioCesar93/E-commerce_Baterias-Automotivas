package com.jcs.BateriaStore.controllers;

import com.jcs.BateriaStore.dtos.StateDto;
import com.jcs.BateriaStore.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/states")
public class StateController {

    @Autowired
    private StateService service;

    @GetMapping
    public ResponseEntity<Page<StateDto>> findAllPaged(
            Pageable pageable) {
        return ResponseEntity.ok()
                .body(service.findAllPaged(pageable));
    }

    @GetMapping(value = "/search")
    public ResponseEntity<List<StateDto>> findByCountryCode(@RequestParam("code") String code) {
        List<StateDto> list = service.findByCountryCode(code);
        return ResponseEntity.ok().body(list);
    }
}