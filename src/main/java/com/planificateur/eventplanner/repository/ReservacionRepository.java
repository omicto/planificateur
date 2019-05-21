package com.planificateur.eventplanner.repository;

import com.planificateur.eventplanner.models.Reservacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface ReservacionRepository extends JpaRepository<Reservacion, Long> {
    List<Reservacion> findByIdCliente(Long idCliente);
    List<Reservacion> findByFechaReservadaBetween(Timestamp fechaReservada, Timestamp fechaReservada2);
    List<Reservacion> findByHoraInicioAfter(Timestamp horaInicio);
    List<Reservacion> findByHoraInicioBefore(Timestamp horaInicio);
    List<Reservacion> findByHoraFinAfter(Timestamp horaFin);
    List<Reservacion> findByHoraFinBefore(Timestamp horaFin);

}
