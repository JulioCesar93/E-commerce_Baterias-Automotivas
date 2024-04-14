package com.jcs.BateriaStore.repositories;

import com.jcs.BateriaStore.entities.Endereco;
import com.jcs.BateriaStore.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    @Query("SELECT DISTINCT obj FROM Endereco obj WHERE "
            + ":user IS NULL OR obj.user IN :user")
    List<Endereco> findbyUserId(User user);

    Optional<Endereco> findById(Long id);
    Endereco save(Endereco entity);
    void deleteById(Long id);
}
