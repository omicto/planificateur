package com.planificateur.eventplanner.controllers.rest;

import com.planificateur.eventplanner.models.Paquete;
import com.planificateur.eventplanner.service.PaquetesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("api")
public class PaqueteController {
    @Autowired
    PaquetesService paquetesService;
    @GetMapping("/packages")
    List<Paquete> findAll(){
        return paquetesService.findAll();
    }

    @PostMapping("/packages/new")
    Paquete save(Paquete p){
        return paquetesService.save(p);
    }
}
