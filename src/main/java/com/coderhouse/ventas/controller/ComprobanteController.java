package com.coderhouse.ventas.controller;

import com.coderhouse.ventas.model.Comprobante;
import com.coderhouse.ventas.service.ComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comprobantes")
public class ComprobanteController {

    @Autowired
    private ComprobanteService comprobanteService;

    @GetMapping()
    public List<Comprobante> buscarComprobantes() {
        return comprobanteService.buscarComprobantes();
    }

    @GetMapping("/{comprobanteId}")
    public Comprobante buscarComprobantePorId(@PathVariable Integer comprobanteId) {
        return comprobanteService.buscarComprobantePorId(comprobanteId);
    }

    @PostMapping()
    public Comprobante crearComprobante(@RequestBody Comprobante comprobante) throws Exception {
        return comprobanteService.crearComprobante(comprobante);
    }

    @PutMapping()
    public Comprobante actualizarComprobante(@RequestBody Comprobante comprobante) throws Exception {
        return comprobanteService.actualizarComprobante(comprobante);
    }

    @DeleteMapping("/{comprobanteId}")
    public void eliminarComprobantePorId(@PathVariable Integer comprobanteId) {
        comprobanteService.eliminarComprobantePorId(comprobanteId);
    }
}
