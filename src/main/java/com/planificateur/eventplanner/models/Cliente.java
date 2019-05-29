package com.planificateur.eventplanner.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @SequenceGenerator(name="idCliente", sequenceName = "PLANIFICATEUR.SECUENCIA_CLIENTES", allocationSize = 1)
    @GeneratedValue(generator="idCliente",strategy=GenerationType.SEQUENCE)
    private long idCliente;
    private String nombre;
    private String apellido;
    private String numTelefono;
    private Timestamp clienteDesde;

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
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

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public Timestamp getClienteDesde() {
        return clienteDesde;
    }

    public void setClienteDesde(Timestamp clienteDesde) {
        this.clienteDesde = clienteDesde;
    }

}
