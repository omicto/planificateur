package com.planificateur.eventplanner.controllers;

import com.planificateur.eventplanner.models.Cliente;
import com.planificateur.eventplanner.models.Local;
import com.planificateur.eventplanner.repository.ClienteRepository;
import com.planificateur.eventplanner.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PininosController {
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    LocalRepository localRepository;

    @GetMapping("/clientes")
    List<Cliente> clientes(){
        return clienteRepository.findAll();
    }

    @GetMapping("/locales")
    List<Local> locales(){
        return localRepository.findAll();
    }


}
