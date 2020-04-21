package com.veterinaria.veterinaria.entidad;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table( name = "HistoriaClinica")
public class HistoriaClinicaEntity {

    //Se tiene que llamar igual a los atributos del modelo
    //Lo de antes de la variable(Integer, String...) deben ser las mismas del modelo
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "idHistoria", nullable = false)
        private Integer codigoHistoria;

        @Column(name = "procedimiento", nullable = false)
        private String procedimientos;

        @Column(name = "medicamentos", nullable = false)
        private String medicamentos;

        //Aqui falta un @ManyToOne o un @OneToMany o un @OneToOne todo depende de como este relacionada sus bases de datos
        @JoinColumn(name = "codigoPaciente")
        private PacienteEntity codigoPaciente;

        @Column(name = "codigoPrpietario", nullable = false)
        private PropietarioEntity codigoPropietario;

    public HistoriaClinicaEntity(Integer codigoHistoria, String procedimientos, String medicamentos, PacienteEntity codigoPaciente, PropietarioEntity codigoPropietario) {
        this.codigoHistoria = codigoHistoria;
        this.procedimientos = procedimientos;
        this.medicamentos = medicamentos;
        this.codigoPaciente = codigoPaciente;
        this.codigoPropietario = codigoPropietario;
    }
}
