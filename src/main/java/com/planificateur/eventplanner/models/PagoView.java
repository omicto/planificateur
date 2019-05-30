package com.planificateur.eventplanner.models;

import jdk.nashorn.internal.ir.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity @Table(name = "view_pagos") @Immutable
@IdClass(PagoView.IdClass.class)
public class PagoView{
    @Id
    private long folioReservacion;
    @Id
    private long numPago;
    private float montoPagado;
    private float montoRestante;
    private Timestamp fechaPago;
    private Long idCliente;
    private String nombre;
    private String apellido;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    static class IdClass implements Serializable {
        private long folioReservacion;
        private long numPago;
    }

}
