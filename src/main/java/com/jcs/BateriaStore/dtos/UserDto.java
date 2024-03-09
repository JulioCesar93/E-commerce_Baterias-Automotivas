package com.jcs.BateriaStore.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class UserDto {

    private Long id;
    @NotBlank
    private String firstName;
    private String lastName;
    private String cpf;
    private String phone;
    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate birthDay;
    @NotBlank
    @Email
    private String email;
    Set<ProfileDto> roles = new HashSet<>();
}