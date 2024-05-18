package com.jcs.BateriaStore.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Entity
@Table(name = "tb_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable, UserDetails {

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
    private Profile profile;

    //Mapear user e Profile
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tb_user_profile",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "profile_id"))
    private Set<Profile> profiles = new HashSet<>();

    //Endereço-Cliente
    @OneToMany(mappedBy = "user")
    public List<Endereco> enderecoList = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities () {
        return profiles.stream().map(profile -> new SimpleGrantedAuthority(profile.getAuthority()))
                .collect(Collectors.toList());
    }
        //Find DTO's
        @Override
        public String getUsername () {
            return email;
        }

        @Override
        public boolean isAccountNonExpired () {
            return true;
        }

        @Override
        public boolean isAccountNonLocked () {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired () {
            return true;
        }

        @Override
        public boolean isEnabled () {
            return true;
        }
    }