package com.planificateur.eventplanner.controllers.rest;

import com.planificateur.eventplanner.models.Paquete;
import com.planificateur.eventplanner.service.PaquetesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("api")
public class PaqueteController {
    @Autowired
    PaquetesService paquetesService;
    @GetMapping("/packages")
    List<Paquete> findAll(){
        return paquetesService.findAll();
    }

    @GetMapping("/packages/{idPaquete}")
    Paquete getOne(@PathVariable Long idPaquete){
        return paquetesService.getOne(idPaquete);
    }

    @PostMapping("/packages/new")
    Paquete save(Paquete p){
        return paquetesService.save(p);
    }

    @PutMapping("/packages/{idPaquete}")
    Paquete update(@PathVariable Long idPaquete, Paquete nuevo){
        return paquetesService.update(idPaquete, nuevo);
    }

    @DeleteMapping("/packages/{idPaquete}")
    void deleteById(@PathVariable Long idPaquete){
        paquetesService.deleteById(idPaquete);
    }
}
