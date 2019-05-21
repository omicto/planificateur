package com.planificateur.eventplanner.service;

import com.planificateur.eventplanner.models.Event;
import com.planificateur.eventplanner.models.Reservacion;
import com.planificateur.eventplanner.repository.ReservacionRepository;
import com.planificateur.eventplanner.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    @Autowired
    ReservacionRepository reservacionRepository;

    @Autowired
    ReservacionesService reservacionesService;

    public List<Event> findAll(){
        List<Reservacion> reservaciones = reservacionRepository.findAll();
        return Event.eventifyBatch(reservaciones);
    }

    public List<Event> findBetween(String start, String end){
        List<Reservacion> reservaciones = reservacionesService.findByFechaReservadaBetween(start, end);
        return Event.eventifyBatch(reservaciones);
    }

}
