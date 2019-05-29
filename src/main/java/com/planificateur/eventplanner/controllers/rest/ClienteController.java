package com.planificateur.eventplanner.controllers.rest;

import com.planificateur.eventplanner.models.Cliente;
import com.planificateur.eventplanner.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("api")
public class ClienteController {
    @Autowired
    ClientesService clienteService;
    @GetMapping("/clients")
    List<Cliente> findAll(){
        return clienteService.findAll();
    }
}
