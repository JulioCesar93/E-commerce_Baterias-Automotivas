package com.jcs.BateriaStore.services;

import com.jcs.BateriaStore.dtos.EnderecoDto;
import com.jcs.BateriaStore.entities.Endereco;
import com.jcs.BateriaStore.entities.User;
import com.jcs.BateriaStore.repositories.EnderecoRepository;
import com.jcs.BateriaStore.repositories.UserRepository;
import com.jcs.BateriaStore.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    @Autowired
    private UserRepository userRepository;

    public List<EnderecoDto> findAll() {
        List<Endereco> list = repository.findAll();
        return list.stream().map(x -> new EnderecoDto(x)).collect(Collectors.toList());
    }

    public List<EnderecoDto> getByUserId(Long userId) {
        User user = userRepository.getReferenceById(userId);
        List<Endereco> list = repository.findbyUserId(user);
        return list.stream().map(x -> new EnderecoDto(x)).collect(Collectors.toList());
    }

    public EnderecoDto findById(Long id) {
        Optional<Endereco> obj = repository.findById(id);
        Endereco entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new EnderecoDto(entity);
    }
}

//Add Transactional annotation
// insert, update, delete enderecoDto