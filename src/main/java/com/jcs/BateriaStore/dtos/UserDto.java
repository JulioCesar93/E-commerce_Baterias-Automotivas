package com.jcs.BateriaStore.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jcs.BateriaStore.entities.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {

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
    Set<ProfileDto> profiles = new HashSet<>();
    Set<EnderecoDto> enderecoList = new HashSet<>();


    public UserDto(User entity) {
        id = entity.getId();
        firstName = entity.getFirstName();
        lastName = entity.getLastName();
        email = entity.getEmail();
        cpf = entity.getCpf();
        birthDay = entity.getBirthDay();
        phone = entity.getPhone();
        entity.getProfiles().forEach(profile -> this.profiles.add(new ProfileDto(profile)));
        entity.getEnderecoList().forEach(endereco -> this.enderecoList.add(new EnderecoDto(endereco)));
    }
}
