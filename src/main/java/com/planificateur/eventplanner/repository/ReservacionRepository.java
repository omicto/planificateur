package com.planificateur.eventplanner.repository;

import com.planificateur.eventplanner.models.Reservacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;
import java.util.List;

public interface ReservacionRepository extends JpaRepository<Reservacion, Long> {
    // SELECT * FROM reservaciones WHERE id_cliente = ____
    List<Reservacion> findByIdCliente(Long idCliente);
    // SELECT * FROM reservaciones WHERE fecha_reservada BETWEN _____ AND _______
    List<Reservacion> findByFechaReservadaBetween(Timestamp fechaReservada, Timestamp fechaReservada2);
    List<Reservacion> findByHoraInicioAfter(Timestamp horaInicio);
    List<Reservacion> findByHoraInicioBefore(Timestamp horaInicio);
    List<Reservacion> findByHoraFinAfter(Timestamp horaFin);
    List<Reservacion> findByHoraFinBefore(Timestamp horaFin);
    Reservacion findByFechaReservadaAndHoraInicio(Timestamp fechaReservada,Timestamp horaInicio);
    List<Reservacion> findByStatus(Long status);

}
