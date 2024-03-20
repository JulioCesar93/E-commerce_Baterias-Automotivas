package com.jcs.BateriaStore.repositories;

import com.jcs.BateriaStore.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> { }
