package com.carrito.repository;

import com.carrito.entity.DetalleFacturas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleFacturasRepository extends JpaRepository<DetalleFacturas, Integer> {
}
