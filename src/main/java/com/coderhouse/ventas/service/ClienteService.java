package com.coderhouse.ventas.service;

import com.coderhouse.ventas.model.Cliente;
import com.coderhouse.ventas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> buscarTodosLosClientes() {
        return clienteRepository.findAll();
    }

    public Cliente buscarPorClienteId(Integer clienteId) {
        return clienteRepository.findById(clienteId).orElse(null);
    }

}
