package com.coderhouse.ventas.controller;

import com.coderhouse.ventas.model.Venta;
import com.coderhouse.ventas.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping()
    public List<Venta> buscarVentas() {
        return ventaService.buscarVentas();
    }

    @GetMapping("/{ventaId}")
    public Venta buscarVentaPorId(@PathVariable Integer ventaId) {
        return ventaService.buscarVentaPorId(ventaId);
    }

    @PostMapping()
    public Venta crearVenta(@RequestBody Venta venta) throws Exception {
        return ventaService.crearVenta(venta);
    }

    @PutMapping()
    public Venta actualizarVenta(@RequestBody Venta venta) throws Exception {
        return ventaService.actualizarVenta(venta);
    }

    @DeleteMapping("/{ventaId}")
    public void eliminarVentaPorId(@PathVariable Integer ventaId) {
        ventaService.eliminarVentaPorId(ventaId);
    }
}

