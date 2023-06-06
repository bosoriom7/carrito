package com.carrito.repository;

import com.carrito.entity.Facturas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturasRepository extends JpaRepository<Facturas, Integer> {
}
