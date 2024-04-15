package com.jcs.BateriaStore.repositories;

import com.jcs.BateriaStore.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository <Country, Long> {
    Optional<Country> findById(Long id);
}
