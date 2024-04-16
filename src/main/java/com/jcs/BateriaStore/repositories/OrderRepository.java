package com.jcs.BateriaStore.repositories;

import com.jcs.BateriaStore.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Optional<Order> findById(Long id);
    Order save(Order entity);
    void deleteById(Long id);
}
