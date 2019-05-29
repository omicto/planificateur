package com.planificateur.eventplanner.controllers.rest;

import com.planificateur.eventplanner.models.Reservacion;
import com.planificateur.eventplanner.service.ReservacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("api")
public class ReservacionesController {
    @Autowired
    ReservacionesService reservacionesService;

    @GetMapping("reservations")
    List<Reservacion> findAll(){
        return reservacionesService.findAll();
    }

    @PostMapping("reservations")
    Reservacion save(Reservacion r){
        return reservacionesService.save(r);
    }

}
