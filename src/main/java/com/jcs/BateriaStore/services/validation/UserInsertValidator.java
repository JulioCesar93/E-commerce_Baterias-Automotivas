package com.jcs.BateriaStore.services.validation;

import com.jcs.BateriaStore.dtos.UserInsertDto;
import com.jcs.BateriaStore.repositories.UserRepository;
import jakarta.validation.ConstraintValidator;
import org.springframework.beans.factory.annotation.Autowired;

public class UserInsertValidator implements ConstraintValidator<UserInsertValid, UserInsertDto> {

    @Autowired
    private UserRepository repository;

    @Override
    public void initialize(UserInsertValid validAll) {
    }
}
