package com.carrito.repository;

import com.carrito.entity.Authority;
import com.carrito.utils.AuthorityName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Optional<Authority>findByName(AuthorityName name);
}
