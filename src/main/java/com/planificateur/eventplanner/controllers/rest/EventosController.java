package com.planificateur.eventplanner.controllers.rest;

import com.planificateur.eventplanner.models.Event;
import com.planificateur.eventplanner.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/api")
public class EventosController {
    @Autowired
    EventService eventService;

    @GetMapping("/events/all")
    List<Event> eventos(){
        return eventService.findAll();
    }

    @GetMapping("/events")
    List<Event> eventosBetween(@RequestParam String start, @RequestParam String end){

        return eventService.findBetween(start,end);
    }
}
