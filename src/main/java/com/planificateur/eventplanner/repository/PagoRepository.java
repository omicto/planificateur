package com.planificateur.eventplanner.repository;

import com.planificateur.eventplanner.models.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PagoRepository extends JpaRepository<Pago, Long> {
    List<Pago> findByFolioReservacion(Long folioReservacion);
    Pago findByFolioReservacionAndNumPago(Long folioReservacion, Long numPago);
}
