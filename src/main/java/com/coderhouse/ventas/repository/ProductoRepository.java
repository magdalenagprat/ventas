package com.coderhouse.ventas.repository;

import com.coderhouse.ventas.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
