package com.planificateur.eventplanner.controllers;

import com.planificateur.eventplanner.models.*;
import com.planificateur.eventplanner.repository.ClienteRepository;
import com.planificateur.eventplanner.repository.LocalRepository;
import com.planificateur.eventplanner.repository.ReservacionRepository;
import com.planificateur.eventplanner.service.EventService;
import com.planificateur.eventplanner.service.PagosService;
import com.planificateur.eventplanner.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@RestController @RequestMapping("pininos")
public class PininosController {
    @Autowired
    ReservacionRepository reservacionRepository;
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    LocalRepository localRepository;
    @Autowired
    EventService eventService;

    @Autowired
    PagosService pagosService;

    @GetMapping("/clientes")
    List<Cliente> clientes(){
        return clienteRepository.findAll();
    }

    @GetMapping("/locales")
    List<Local> locales(){
        return localRepository.findAll();
    }



    @GetMapping("/reservaciones")
    List<Reservacion> reservaciones(){
        return reservacionRepository.findAll();
    }

    @GetMapping("pagos")
    List<Pago> pagos(){
        return pagosService.findAll();
    }
}
