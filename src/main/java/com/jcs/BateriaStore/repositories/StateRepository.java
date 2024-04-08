package com.jcs.BateriaStore.repositories;

import com.jcs.BateriaStore.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface StateRepository extends JpaRepository<State, Long> {

    List<State> findByCountryCode(@Param("code") String code);
}