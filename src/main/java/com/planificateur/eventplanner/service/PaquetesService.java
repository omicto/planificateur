package com.planificateur.eventplanner.service;

import com.planificateur.eventplanner.models.Paquete;
import com.planificateur.eventplanner.repository.PaqueteRepository;
import com.planificateur.eventplanner.util.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaquetesService implements IService<Paquete> {
    @Autowired
    PaqueteRepository paqueteRepository;

     public List<Paquete> findAll(){
         return paqueteRepository.findAll();
     }

     public Paquete getOne(Long id){
         return paqueteRepository.getOne(id);
     }

     public Paquete save(Paquete p){
         return paqueteRepository.save(p);
     }

     public Paquete update(Long id, Paquete nuevo){
         Paquete existente = getOne(id);
         PropertyUtils.myCopyProperties(nuevo, existente);
         return save(existente);
     }

     public void deleteById(Long id){
         paqueteRepository.deleteById(id);
     }


}
