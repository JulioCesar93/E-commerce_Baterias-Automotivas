package com.jcs.BateriaStore.controllers.exceptions;

import com.jcs.BateriaStore.dtos.UserDto;
import com.jcs.BateriaStore.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping (value = "/{id}")
    public ResponseEntity<List<UserDto>> findAll() {
        List<UserDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    //POST
    //PUT {ID}
    //DELETE {ID}
}
