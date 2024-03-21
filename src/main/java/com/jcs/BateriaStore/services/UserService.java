package com.jcs.BateriaStore.services;

import com.jcs.BateriaStore.repositories.ProfileRepository;
import com.jcs.BateriaStore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository repository;

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private EnderecoService enderecoRepository;
}
