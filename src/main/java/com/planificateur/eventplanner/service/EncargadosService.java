package com.planificateur.eventplanner.service;

import com.planificateur.eventplanner.models.Encargado;
import com.planificateur.eventplanner.repository.EncargadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

// TODO this is a simple wrapper of the EncargadoRepository interface, add more methods later

@Service
public class EncargadosService implements IService<Encargado> {
    @Autowired
    EncargadoRepository encargadoRepository;

    public List<Encargado> findAll(){
        return encargadoRepository.findAll();
    }

    public Encargado getOne(Long id){
        return encargadoRepository.getOne(id);
    }

    public Encargado save(Encargado e){
        return encargadoRepository.saveAndFlush(e);
    }

    public void deleteById(Long id){
        encargadoRepository.deleteById(id);
    }



}
