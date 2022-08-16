package com.coderhouse.ventas.repository;

import com.coderhouse.ventas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
