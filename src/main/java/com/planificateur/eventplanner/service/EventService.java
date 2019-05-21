package com.planificateur.eventplanner.service;

import com.planificateur.eventplanner.models.Event;
import com.planificateur.eventplanner.models.Reservacion;
import com.planificateur.eventplanner.repository.ReservacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    @Autowired
    ReservacionRepository reservacionRepository;

    public List<Event> findAll(){
        List<Event> events = new ArrayList<>();
        List<Reservacion> reservaciones = reservacionRepository.findAll();
        return Event.eventifyBatch(reservaciones);
    }

}
