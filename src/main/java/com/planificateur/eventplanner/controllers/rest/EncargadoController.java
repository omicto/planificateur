package com.planificateur.eventplanner.controllers.rest;

import com.planificateur.eventplanner.models.Encargado;
import com.planificateur.eventplanner.service.EncargadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("api")
public class EncargadoController {
    @Autowired
    EncargadosService encargadosService;

    @GetMapping("/managers")
    List<Encargado> findAll(){
        return encargadosService.findAll();
    }
}
