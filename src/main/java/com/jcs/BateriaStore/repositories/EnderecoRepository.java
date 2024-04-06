package com.jcs.BateriaStore.repositories;

import com.jcs.BateriaStore.entities.Endereco;
import com.jcs.BateriaStore.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    List<Endereco> findbyUserId(User user);
}
