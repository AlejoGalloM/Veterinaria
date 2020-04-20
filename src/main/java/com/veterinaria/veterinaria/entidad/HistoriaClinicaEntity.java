package com.veterinaria.veterinaria.entidad;

import com.veterinaria.veterinaria.dominio.modelo.Paciente;
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table( name = "HistoriaClinica")
public class HistoriaClinicaEntity {

    @Id
    @GeneratedValue
    @Column(name = "idHistoria")
    private Integer codigoHistoria;
    @Column(name = "procedimiento")
    private String procedimientos;
    @Column(name = "medicamentos")
    private String medicamentos;
    @Column(name = "codigoPrpietario")
    private Integer codigoPropietario;
}
