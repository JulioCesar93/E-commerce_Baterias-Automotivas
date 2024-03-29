package com.jcs.BateriaStore.services.validation;

import com.jcs.BateriaStore.dtos.UserUpdateDto;
import com.jcs.BateriaStore.repositories.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintValidator;
import org.springframework.beans.factory.annotation.Autowired;

public class UserUpdateValidator implements ConstraintValidator<UserUpdateValid, UserUpdateDto> {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private UserRepository repository;

    @Override
    public void initialize(UserUpdateValid validAll) {
    }
}