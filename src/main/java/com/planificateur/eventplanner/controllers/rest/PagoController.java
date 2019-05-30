package com.planificateur.eventplanner.controllers.rest;

import com.planificateur.eventplanner.models.Pago;
import com.planificateur.eventplanner.service.PagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController @RequestMapping("api")
public class PagoController {
    @Autowired
    PagosService pagosService;

    @GetMapping("payments")
    List<Pago> findAll(){
        return pagosService.findAll();
    }

    @GetMapping("payments/{folioReservacion}")
    List<Pago> findAllByFolioReservacion(@PathVariable Long folioReservacion){
        return pagosService.findByFolioReservacion(folioReservacion);
    }

    @PostMapping("payments/{folioReservacion}")
    String newPayment(@PathVariable Long folioReservacion, Float pago) throws IOException {
        pagosService.save(folioReservacion, pago);
        return "Received $" + pago + "as payment for reservation #" + folioReservacion;
    }

}
