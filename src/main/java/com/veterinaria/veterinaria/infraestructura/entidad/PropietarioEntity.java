package com.veterinaria.veterinaria.infraestructura.entidad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Propietario")
public class PropietarioEntity {

    @Id
    private Integer id;

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
