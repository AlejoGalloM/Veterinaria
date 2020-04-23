package com.veterinaria.veterinaria.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Entity @Getter @AllArgsConstructor
@Table(name = "Propietario")
public class PropietarioEntity {

    @Id
    @GeneratedValue
    private String id;

    @Column(name = "NombrePro", nullable = false)
    private String nombre;

    @Column(name = "ApellidoPro", nullable = false)
    private String apellido;

    @Column(name = "TelefonoPro", nullable = false)
    private String telefono;

    @Column(name = "DireccionPro", nullable = false)
    private String direccion;

    @Column(name = "EmailPro", nullable = false)
    private String Email;
}
