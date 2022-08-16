package com.coderhouse.ventas.service;

import com.coderhouse.ventas.model.Producto;
import com.coderhouse.ventas.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> buscarProductos() {
        return productoRepository.findAll();
    }

    public Producto buscarProductoPorId(Integer productoId) {
        return productoRepository.findById(productoId).orElse(null);
    }

    public Producto crearProducto(Producto producto) throws Exception {
        if (buscarProductoPorId(producto.getProductoId()) == null) {
            return productoRepository.save(producto);
        } else {
            throw new Exception("El producto ya existe");
        }
    }

    public Producto actualizarProducto(Producto producto) throws Exception {
        if (buscarProductoPorId(producto.getProductoId()) != null) {
            return productoRepository.save(producto);
        } else {
            throw new Exception("El producto no existe");
        }
    }

    public void eliminarProducto(Producto producto) throws Exception {
        if (buscarProductoPorId(producto.getProductoId()) != null) {
            productoRepository.delete(producto);
        } else {
            throw new Exception("El producto no existe");
        }
    }

    public void eliminarProductoPorId(Integer productoId) {
        productoRepository.deleteById(productoId);
    }
}
