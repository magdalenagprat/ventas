package com.coderhouse.ventas.service;

import com.coderhouse.ventas.model.Venta;
import com.coderhouse.ventas.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> buscarVentas() {
        return ventaRepository.findAll();
    }

    public Venta buscarVentaPorId(Integer ventaId) {
        return ventaRepository.findById(ventaId).orElse(null);
    }

    public Venta crearVenta(Venta venta) throws Exception {
        if (buscarVentaPorId(venta.getVentaId()) == null) {
            return ventaRepository.save(venta);
        } else {
            throw new Exception("La venta ya existe");
        }
    }

    public Venta actualizarVenta(Venta venta) throws Exception {
        if (buscarVentaPorId(venta.getVentaId()) != null) {
            return ventaRepository.save(venta);
        } else {
            throw new Exception("La venta no existe");
        }
    }

    public void eliminarVenta(Venta venta) throws Exception {
        if (buscarVentaPorId(venta.getVentaId()) != null) {
            ventaRepository.delete(venta);
        } else {
            throw new Exception("La venta no existe");
        }
    }

    public void eliminarVentaPorId(Integer ventaId) {
        ventaRepository.deleteById(ventaId);
    }
}
