package com.planificateur.eventplanner.service;

import com.planificateur.eventplanner.models.Cliente;
import com.planificateur.eventplanner.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService implements IService<Cliente> {
    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Cliente getOne(Long id){
        return clienteRepository.getOne(id);
    }

    public Cliente save(Cliente c){
        return clienteRepository.save(c);
    }

    public void deleteById(Long id){
        clienteRepository.deleteById(id);
    }
}
