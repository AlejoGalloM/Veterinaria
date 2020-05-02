package com.veterinaria.veterinaria.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Paciente")
public class PacienteEntity {

    @Id
    @GeneratedValue
    private Integer codigoPaciente;

    @Column(name = "nombrePte", nullable = false)
    private String nombre;

    @Column(name = "razaPte", nullable = false)
    private String raza;

    @Column(name = "especiePte", nullable = false)
    private String especie;

    @Column(name = "pesoPte", nullable = false)
    private int peso;

    @ManyToOne
    @JoinColumn
    private PropietarioEntity codigoPropietario;
}
