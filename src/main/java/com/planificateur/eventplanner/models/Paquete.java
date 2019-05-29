package com.planificateur.eventplanner.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "paquetes")
public class Paquete {
    @Id @GeneratedValue
    private long idPaquete;
    private String descripcion;
    private String detalles;
    private float costo;

    public long getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(long idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
