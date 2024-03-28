package com.jcs.BateriaStore.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Entity
@Table(name = "tb_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String cpf;
    private String phone;

    @Column(name = "birth_day")
    private LocalDate birthDay;
    @Column(unique = true)
    private String email;
    private String password;

    //Mapear user e Profile
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tb_user_profile",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "profile_id"))
    private Set<Profile> profile = new HashSet<>();

    //Endereço-Cliente
    @OneToMany(mappedBy = "user")
    public List<Endereco> enderecoList = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return profile.stream().map(role -> new SimpleGrantedAuthority(profile.getAuthority()))
                .collect(Collectors.toList());

        //Find DTO's
        public String getUsername () {
            return email;
        }

        public boolean isAccountNonExpired () {
            return true;
        }

        public boolean isAccountNonLocked () {
            return true;
        }

        public boolean isCredentialsNonExpired () {
            return true;
        }

        public boolean isEnabled () {
            return true;
        }
    }
}