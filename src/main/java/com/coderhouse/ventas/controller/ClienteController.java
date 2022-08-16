package com.coderhouse.ventas.controller;

import com.coderhouse.ventas.model.Cliente;
import com.coderhouse.ventas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping()
    public List<Cliente> buscarTodosLosClientes() {
        return clienteService.buscarTodosLosClientes();
    }

    @GetMapping("/clientes/{clienteId}")
    public Cliente buscarPorClienteId(@PathVariable Integer clienteId) {
        return clienteService.buscarPorClienteId(clienteId);
    }
}

