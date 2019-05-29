package com.planificateur.eventplanner.controllers.rest;

import com.planificateur.eventplanner.models.Encargado;
import com.planificateur.eventplanner.service.EncargadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("api")
public class EncargadoController {
    @Autowired
    EncargadosService encargadosService;

    @GetMapping("/managers")
    List<Encargado> findAll(){
        return encargadosService.findAll();
    }

    @PostMapping("/managers/new")
    Encargado save(Encargado e){
        return encargadosService.save(e);
    }

    @DeleteMapping("/managers/{idEncargado}")
    void deleteById(@PathVariable Long idEncargado){
        encargadosService.deleteById(idEncargado);
    }

    @PutMapping("/managers/{idEncargado}")
    Encargado update(@PathVariable Long idEncargado, Encargado nuevo){
        return encargadosService.update(nuevo, idEncargado);
    }
}
