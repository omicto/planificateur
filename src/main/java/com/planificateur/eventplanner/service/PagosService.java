package com.planificateur.eventplanner.service;

import com.planificateur.eventplanner.models.Pago;
import com.planificateur.eventplanner.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


// FIXME Los pagos no tienen ID long!!!!
@Service
public class PagosService {
    @Autowired
    PagoRepository pagoRepository;

    public List<Pago> findAll(){
        return pagoRepository.findAll();
    }

    public Pago getOne(Long id){
        return pagoRepository.getOne(id);
    }

    public Pago save(Pago p){
        return pagoRepository.save(p);
    }

    public void deleteById(Long id){
        pagoRepository.deleteById(id);
    }
}
