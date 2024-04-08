package com.jcs.BateriaStore.services;

import com.jcs.BateriaStore.dtos.CategoryDto;
import com.jcs.BateriaStore.entities.Category;
import com.jcs.BateriaStore.repositories.CategoryRepository;
import com.jcs.BateriaStore.services.exceptions.ExceptionBD;
import com.jcs.BateriaStore.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository repository;

    public Page<CategoryDto> findAllPaged(Pageable pageable) {
        Page<Category> page = repository.findAll(pageable);
        return page.map(x -> new CategoryDto(x));
    }

    public CategoryDto insert(CategoryDto dto) {
        Category entity = new Category();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        entity = repository.save(entity);
        return new CategoryDto(entity);
    }

    @Transactional
    public CategoryDto update(Long id, CategoryDto dto) {
        try {
            Category entity = repository.getReferenceById(id);

            entity.setId(dto.getId());
            entity.setName(dto.getName());

            entity = repository.save(entity);
            return new CategoryDto(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Id não encontrado " + id);
        }
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Id not found " + id);
        } catch (DataIntegrityViolationException e) {
            throw new ExceptionBD("Integrity violation");
        }
    }
}