package com.planificateur.eventplanner.models;



import javax.persistence.*;

@Entity @Table(name = "encargados")
public class Encargado {
    @Id
    @SequenceGenerator(name="idEncargado", sequenceName = "PLANIFICATEUR.SECUENCIA_ENCARGADOS", allocationSize = 1)
    @GeneratedValue(generator="idEncargado",strategy=GenerationType.SEQUENCE)
    private Long idEncargado;
    private String nombre;
    private String apellido;
    private String numTelefono;

    public Long getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(Long idEncargado) {
        this.idEncargado = idEncargado;
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
}
