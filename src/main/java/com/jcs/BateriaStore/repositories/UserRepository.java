package com.jcs.BateriaStore.repositories;

import com.jcs.BateriaStore.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    User findByEmail(String email);

    Optional<User> findById(Long id);

    User save(User entity);

    void deleteById(Long id);
}