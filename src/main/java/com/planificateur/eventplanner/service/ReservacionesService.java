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
public class ReservacionesService {
    @Autowired
    ReservacionRepository reservacionRepository;

    public List<Reservacion> findAll() {
        return reservacionRepository.findAll();
    }

    public Reservacion save(Reservacion r){
        // Check if there's a free spot in the selected time

        return reservacionRepository.saveAndFlush(r);
    }

    public List<Reservacion> findByFechaReservadaBetween(String start, String end) {
        Timestamp startTimestamp = DateUtils.toTimestamp(start);
        Timestamp endTimestamp = DateUtils.toTimestamp(end);
        return reservacionRepository.findByFechaReservadaBetween(startTimestamp, endTimestamp);
    }
}
