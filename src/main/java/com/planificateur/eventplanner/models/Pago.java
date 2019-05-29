package com.planificateur.eventplanner.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity @Table(name = "pagos")
public class Pago {
    @Id @GeneratedValue
    private long folioReservacion;
    private long numPago;
    private float montoPagado;
    private float montoRestante;
    private Timestamp fecha_pago;

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

    public Timestamp getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Timestamp fecha_pago) {
        this.fecha_pago = fecha_pago;
    }
}
