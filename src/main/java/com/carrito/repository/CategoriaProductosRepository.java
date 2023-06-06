package com.carrito.repository;

import com.carrito.entity.CategoriaProductos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaProductosRepository extends JpaRepository<CategoriaProductos, Integer> {
}
