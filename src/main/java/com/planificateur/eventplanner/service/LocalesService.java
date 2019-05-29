package com.planificateur.eventplanner.service;

import com.planificateur.eventplanner.models.Local;
import com.planificateur.eventplanner.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalesService implements IService<Local> {
    @Autowired
    LocalRepository localRepository;

    public List<Local> findAll(){
        return localRepository.findAll();
    }

    public Local getOne(Long id){
        return localRepository.getOne(id);
    }

    public Local save(Local l){
        return localRepository.save(l);
    }

    public void deleteById(Long id){
        localRepository.deleteById(id);
    }

}
