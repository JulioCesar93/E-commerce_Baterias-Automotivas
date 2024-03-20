package com.jcs.BateriaStore.repositories;

import com.jcs.BateriaStore.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Payment, Long> { }
