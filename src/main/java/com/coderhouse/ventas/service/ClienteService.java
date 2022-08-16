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

    public List<Cliente> buscarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente buscarClientePorId(Integer clienteId) {
        return clienteRepository.findById(clienteId).orElse(null);
    }

    public Cliente crearCliente(Cliente cliente) throws Exception {
        if (buscarClientePorId(cliente.getClienteId()) == null) {
            return clienteRepository.save(cliente);
        } else {
            throw new Exception("El cliente ya existe");
        }
    }

    public Cliente actualizarCliente(Cliente cliente) throws Exception {
        if (buscarClientePorId(cliente.getClienteId()) != null) {
            return clienteRepository.save(cliente);
        } else {
            throw new Exception("El cliente no existe");
        }
    }

    public void eliminarCliente(Cliente cliente) throws Exception {
        if (buscarClientePorId(cliente.getClienteId()) != null) {
            clienteRepository.delete(cliente);
        } else {
            throw new Exception("El cliente no existe");
        }
    }

    public void eliminarClientePorId(Integer clienteId) {
        clienteRepository.deleteById(clienteId);
    }
}
