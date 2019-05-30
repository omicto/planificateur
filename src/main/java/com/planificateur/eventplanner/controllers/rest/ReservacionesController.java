package com.planificateur.eventplanner.controllers.rest;

import com.planificateur.eventplanner.models.Local;
import com.planificateur.eventplanner.models.Reservacion;
import com.planificateur.eventplanner.service.ReservacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("api")
public class ReservacionesController {
    @Autowired
    ReservacionesService reservacionesService;


    @GetMapping("reservations")
    List<Reservacion> findAll(){
        return reservacionesService.findAll();
    }

    @PostMapping("reservations/new")
    Reservacion save(Reservacion r){
        return reservacionesService.save(r);
    }

    @DeleteMapping("reservations/{folio}")
    void deleteById(@PathVariable Long folio){
        // FIXME Aqui va la logica de checar si la reservacion se puede borrar o que onda
        reservacionesService.deleteById(folio);
    }

    @GetMapping("reservations/pending")
    List<Reservacion> pendientes(){
        return reservacionesService.getPendientes();
    }



}
