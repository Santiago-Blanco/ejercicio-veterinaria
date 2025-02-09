package com.veterinaria.Ejercicio.Veterinaria.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Dueño {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_dueño;
    private String nombre;
    private String apellido;
    private String celular;
    private String dni;

    public Dueño() {
    }

    public Dueño(Long id_dueño, String nombre, String apellido, String celular, String dni) {
        this.id_dueño = id_dueño;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.dni = dni;
    }
}
