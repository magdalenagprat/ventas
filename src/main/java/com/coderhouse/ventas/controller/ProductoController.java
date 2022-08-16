package com.coderhouse.ventas.controller;

import com.coderhouse.ventas.model.Producto;
import com.coderhouse.ventas.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping()
    public List<Producto> buscarProductos() {
        return productoService.buscarProductos();
    }

    @GetMapping("/{productoId}")
    public Producto buscarProductoPorId(@PathVariable Integer productoId) {
        return productoService.buscarProductoPorId(productoId);
    }

    @PostMapping()
    public Producto crearProducto(@RequestBody Producto producto) throws Exception {
        return productoService.crearProducto(producto);
    }

    @PutMapping()
    public Producto actualizarProducto(@RequestBody Producto producto) throws Exception {
        return productoService.actualizarProducto(producto);
    }

    @DeleteMapping("/{productoId}")
    public void eliminarProductoPorId(@PathVariable Integer productoId) {
        productoService.eliminarProductoPorId(productoId);
    }
}
