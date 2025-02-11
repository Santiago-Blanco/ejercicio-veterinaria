package com.veterinaria.Ejercicio.Veterinaria.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    @OneToOne
    @JoinColumn(name = "id_dueño")
    Dueño dueño;

    public Mascota() {
    }

    public Mascota(Long id, String nombre, String especie, String raza, String color, Dueño dueño) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.dueño = dueño;
    }
}
