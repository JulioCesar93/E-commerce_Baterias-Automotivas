package com.jcs.BateriaStore.services;

import com.jcs.BateriaStore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EnderecoRepository {

    @Autowired
    private EnderecoRepository repository;

    @Autowired
    private UserRepository userRepository;
}
