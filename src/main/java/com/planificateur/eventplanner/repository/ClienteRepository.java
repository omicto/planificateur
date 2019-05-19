package com.planificateur.eventplanner.repository;

import com.planificateur.eventplanner.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
