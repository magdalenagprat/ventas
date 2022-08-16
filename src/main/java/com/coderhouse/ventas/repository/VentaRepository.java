package com.coderhouse.ventas.repository;

import com.coderhouse.ventas.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Integer> {
}
