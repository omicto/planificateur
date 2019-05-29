package com.planificateur.eventplanner.controllers.rest;

import com.planificateur.eventplanner.models.Cliente;
import com.planificateur.eventplanner.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("api")
public class ClienteController {
    @Autowired
    ClientesService clienteService;
    @GetMapping("/clients")
    List<Cliente> findAll(){
        return clienteService.findAll();
    }

    @PostMapping("/clients/new")
    Cliente save(Cliente c){
        return clienteService.save(c);
    }

    @DeleteMapping("/clients/{idCliente}")
    void deleteById(@PathVariable Long idCliente){
        clienteService.deleteById(idCliente);
    }

    @PutMapping("/clients/{idCliente}")
    Cliente update(Cliente c, @PathVariable Long idCliente){
        return clienteService.update(c, idCliente);
    }

}
