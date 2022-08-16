package com.coderhouse.ventas.service;

import com.coderhouse.ventas.model.Comprobante;
import com.coderhouse.ventas.repository.ComprobanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprobanteService {

    @Autowired
    private ComprobanteRepository comprobanteRepository;

    public List<Comprobante> buscarComprobantes() {
        return comprobanteRepository.findAll();
    }

    public Comprobante buscarComprobantePorId(Integer comprobanteId) {
        return comprobanteRepository.findById(comprobanteId).orElse(null);
    }

    public Comprobante crearComprobante(Comprobante comprobante) throws Exception {
        if (buscarComprobantePorId(comprobante.getComprobanteId()) == null) {
            return comprobanteRepository.save(comprobante);
        } else {
            throw new Exception("El comprobante ya existe");
        }
    }

    public Comprobante actualizarComprobante(Comprobante comprobante) throws Exception {
        if (buscarComprobantePorId(comprobante.getComprobanteId()) != null) {
            return comprobanteRepository.save(comprobante);
        } else {
            throw new Exception("El comprobante no existe");
        }
    }

    public void eliminarComprobante(Comprobante comprobante) throws Exception {
        if (buscarComprobantePorId(comprobante.getComprobanteId()) != null) {
            comprobanteRepository.delete(comprobante);
        } else {
            throw new Exception("El comprobante no existe");
        }
    }

    public void eliminarComprobantePorId(Integer comprobanteId) {
        comprobanteRepository.deleteById(comprobanteId);
    }
}