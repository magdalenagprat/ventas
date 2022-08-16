package com.coderhouse.ventas.repository;

import com.coderhouse.ventas.model.Comprobante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComprobanteRepository extends JpaRepository<Comprobante, Integer> {
}
