package com.planificateur.eventplanner.controllers;

import com.planificateur.eventplanner.models.Cliente;
import com.planificateur.eventplanner.models.Event;
import com.planificateur.eventplanner.models.Local;
import com.planificateur.eventplanner.models.Reservacion;
import com.planificateur.eventplanner.repository.ClienteRepository;
import com.planificateur.eventplanner.repository.LocalRepository;
import com.planificateur.eventplanner.repository.ReservacionRepository;
import com.planificateur.eventplanner.service.EventService;
import com.planificateur.eventplanner.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@RestController
public class PininosController {
    @Autowired
    ReservacionRepository reservacionRepository;
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    LocalRepository localRepository;
    @Autowired
    EventService eventService;

    @GetMapping("/clientes")
    List<Cliente> clientes(){
        return clienteRepository.findAll();
    }

    @GetMapping("/locales")
    List<Local> locales(){
        return localRepository.findAll();
    }

    @GetMapping("/eventos/all")
    List<Event> eventos(){
        return eventService.findAll();
    }

    @GetMapping("/eventos")
    List<Event> eventosBetween(@RequestParam String start, @RequestParam String end){

        return eventService.findBetween(start,end);
    }

    @GetMapping("/reservaciones")
    List<Reservacion> reservaciones(){
        return reservacionRepository.findAll();
    }
}
