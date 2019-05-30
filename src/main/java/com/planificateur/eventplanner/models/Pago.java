package com.planificateur.eventplanner.models;

import org.springframework.data.annotation.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

// FIXME Los pagos no tienen ID long!!!! son ID compuesta

@Entity @Table(name = "pagos") @Immutable @IdClass(Pago.IdClass.class)
public class Pago {
    @Id
    private long folioReservacion;
    @Id
    private long numPago;
    private float montoPagado;
    private float montoRestante;
    private Timestamp fechaPago;

    public long getFolioReservacion() {
        return folioReservacion;
    }

    public void setFolioReservacion(long folioReservacion) {
        this.folioReservacion = folioReservacion;
    }

    public long getNumPago() {
        return numPago;
    }

    public void setNumPago(long numPago) {
        this.numPago = numPago;
    }

    public float getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(float montoPagado) {
        this.montoPagado = montoPagado;
    }

    public float getMontoRestante() {
        return montoRestante;
    }

    public void setMontoRestante(float montoRestante) {
        this.montoRestante = montoRestante;
    }

    public Timestamp getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Timestamp fechaPago) {
        this.fechaPago = fechaPago;
    }

    static class IdClass implements Serializable{
        private long folioReservacion;
        private long numPago;
    }
}


