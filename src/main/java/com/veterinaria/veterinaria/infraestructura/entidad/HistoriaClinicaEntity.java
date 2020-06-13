package com.veterinaria.veterinaria.infraestructura.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HistoriaClinica")
public class HistoriaClinicaEntity {

    @Id
    @GeneratedValue
    private Integer codigoHistoria;

    @Column(name = "procedimiento", nullable = false)
    private String procedimientos;

    @Column(name = "medicamentos", nullable = false)
    private String medicamentos;

    @ManyToOne
    @JoinColumn
    private PacienteEntity codigoPaciente;

    @ManyToOne
    @JoinColumn
    private PropietarioEntity codigoPropietario;

}
