package com.coderhouse.ventas.controller;

import com.coderhouse.ventas.model.Cliente;
import com.coderhouse.ventas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping()
    public List<Cliente> buscarClientes() {
        return clienteService.buscarClientes();
    }

    @GetMapping("/{clienteId}")
    public Cliente buscarClientePorId(@PathVariable Integer clienteId) {
        return clienteService.buscarClientePorId(clienteId);
    }

    @PostMapping()
    public Cliente crearCliente(@RequestBody Cliente cliente) throws Exception {
        return clienteService.crearCliente(cliente);
    }

    @PutMapping()
    public Cliente actualizarCliente(@RequestBody Cliente cliente) throws Exception {
        return clienteService.actualizarCliente(cliente);
    }

    @DeleteMapping("/{clienteId}")
    public void eliminarClientePorId(@PathVariable Integer clienteId) {
        clienteService.eliminarClientePorId(clienteId);
    }
}

