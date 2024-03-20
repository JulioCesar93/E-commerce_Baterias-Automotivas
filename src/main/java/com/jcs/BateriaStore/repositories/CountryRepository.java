package com.jcs.BateriaStore.repositories;

import com.jcs.BateriaStore.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
