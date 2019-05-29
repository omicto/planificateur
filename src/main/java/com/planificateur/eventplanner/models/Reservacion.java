package com.planificateur.eventplanner.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "reservaciones")
public class Reservacion {
    @Id
    @SequenceGenerator(name="folioReservacion", sequenceName = "PLANIFICATEUR.SECUENCIA_RESERVACIONES", allocationSize = 1)
    @GeneratedValue(generator="folioReservacion",strategy=GenerationType.SEQUENCE)
    private Long folioReservacion;
    private Timestamp fechaReservada;
    private Timestamp horaInicio;
    private Timestamp horaFin;
    private Long idCliente; // fk
    private Long idPaquete; // fk
    private Long idLocal;   // fk
    private String detallesAdicionales;
    private Float costoTotal;
    private char estaPagada;

    public Long getFolioReservacion() {
        return folioReservacion;
    }

    public void setFolioReservacion(Long folioReservacion) {
        this.folioReservacion = folioReservacion;
    }

    public Timestamp getFechaReservada() {
        return fechaReservada;
    }

    public void setFechaReservada(Timestamp fechaReservada) {
        this.fechaReservada = fechaReservada;
    }

    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Timestamp getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Timestamp horaFin) {
        this.horaFin = horaFin;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Long idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Long getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Long idLocal) {
        this.idLocal = idLocal;
    }

    public String getDetallesAdicionales() {
        return detallesAdicionales;
    }

    public void setDetallesAdicionales(String detallesAdicionales) {
        this.detallesAdicionales = detallesAdicionales;
    }

    public Float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public char getEstaPagada() {
        return estaPagada;
    }

    public void setEstaPagada(char estaPagada) {
        this.estaPagada = estaPagada;
    }
}
