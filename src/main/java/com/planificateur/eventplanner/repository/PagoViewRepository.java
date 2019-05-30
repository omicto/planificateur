package com.planificateur.eventplanner.repository;

import com.planificateur.eventplanner.models.PagoView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PagoViewRepository extends JpaRepository<PagoView, Long> {
    List<PagoView> findByNombreAndApellido(String nombre, String apellido);
    List<PagoView> findByIdCliente(Long idCliente);
}
