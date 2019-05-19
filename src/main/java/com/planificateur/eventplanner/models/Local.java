package com.planificateur.eventplanner.models;


import javax.persistence.*;

@Entity
@Table(name = "locales")
public class Local {
    @Id
    @GeneratedValue
    private long idLocal;
    private String calle;
    private String colonia;
    private String ciudad;
    private int capacidad;
    private float costoPorHora;
    private long idEncargado;

    public long getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(long idLocal) {
        this.idLocal = idLocal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getCostoPorHora() {
        return costoPorHora;
    }

    public void setCostoPorHora(float costoPorHora) {
        this.costoPorHora = costoPorHora;
    }

    public long getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(long idEncargado) {
        this.idEncargado = idEncargado;
    }
}
