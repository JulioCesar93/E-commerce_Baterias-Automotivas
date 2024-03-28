package com.jcs.BateriaStore.services.validation;

import com.jcs.BateriaStore.dtos.UserInsertDto;
import com.jcs.BateriaStore.entities.User;
import com.jcs.BateriaStore.repositories.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class UserInsertValidator implements ConstraintValidator<UserInsertValid, UserInsertDto> {

    @Autowired
    private UserRepository repository;

    @Override
    public void initialize(UserInsertValid validAll) {
    }

    //Constraint_Validator
    @Override
    public boolean isValid(UserInsertDto value, ConstraintValidatorContext context) {
        return false;
    }
}
