package com.planificateur.eventplanner.service;

import com.planificateur.eventplanner.models.Pago;
import com.planificateur.eventplanner.models.PagoView;
import com.planificateur.eventplanner.repository.PagoViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewsService {
    @Autowired
    PagoViewRepository pagoViewRepository;

    public List<PagoView> findPaymentsByNombreAndApellido(String nombre, String apellido){
        return pagoViewRepository.findByNombreAndApellido(nombre, apellido);
    }

    public List<PagoView> findPaymentsByIdCliente(Long idCliente){
        return pagoViewRepository.findByIdCliente(idCliente);
    }

    public List<PagoView> findAll(){
        return pagoViewRepository.findAll();
    }
}
