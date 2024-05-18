package com.jcs.BateriaStore.services;

import com.jcs.BateriaStore.dtos.EnderecoDto;
import com.jcs.BateriaStore.entities.Endereco;
import com.jcs.BateriaStore.entities.User;
import com.jcs.BateriaStore.repositories.EnderecoRepository;
import com.jcs.BateriaStore.repositories.UserRepository;
import com.jcs.BateriaStore.services.exceptions.ExceptionBD;
import com.jcs.BateriaStore.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<EnderecoDto> findAll() {
        List<Endereco> list = repository.findAll();
        return list.stream().map(x -> new EnderecoDto(x)).collect(Collectors.toList());
    }
    @Transactional(readOnly = true)
    public List<EnderecoDto> getByUserId(Long userId) {
        User user = userRepository.getReferenceById(userId);
        List<Endereco> list = repository.findbyUserId(user);
        return list.stream().map(x -> new EnderecoDto(x)).collect(Collectors.toList());
    }

    @Transactional
    public EnderecoDto findById(Long id) {
        Optional<Endereco> obj = repository.findById(id);
        Endereco entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new EnderecoDto(entity);
    }

    @Transactional
    public EnderecoDto insert(EnderecoDto dto) {
        Endereco entity = new Endereco();

        entity.setCep(dto.getCep());
        entity.setBairro(dto.getBairro());
        entity.setComplemento(dto.getComplemento());
        entity.setLogradouro(dto.getLogradouro());
        entity.setLocalidade(dto.getLocalidade());

        User user = new User();
        user.setId(dto.getUserId());
        entity.setUser(user);

        entity = repository.save(entity);
        return new EnderecoDto(entity);
    }

    @Transactional
    public EnderecoDto update(Long id, EnderecoDto dto) {
        try {
            Endereco entity = repository.getReferenceById(id);
            entity.setCep(dto.getCep());
            entity.setBairro(dto.getBairro());
            entity.setComplemento(dto.getComplemento());
            entity.setLogradouro(dto.getLogradouro());
            entity.setLocalidade(dto.getLocalidade());
            entity = repository.save(entity);
            return new EnderecoDto(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("ID não encontrado " + id);
        }
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("ID mão encontrado " + id);
        } catch (DataIntegrityViolationException e) {
            throw new ExceptionBD("Integrity violation");
        }
    }
}