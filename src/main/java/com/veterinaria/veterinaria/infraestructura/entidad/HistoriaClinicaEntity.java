package com.veterinaria.veterinaria.infraestructura.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;

@Getter @Entity
@Table( name = "HistoriaClinica")
public class HistoriaClinicaEntity {

    //Se tiene que llamar igual a los atributos del modelo
    //Lo de antes de la variable(Integer, String...) deben ser las mismas del modelo
        @Id
        @GeneratedValue
        private Integer codigoHistoria;

        @Column(name = "procedimiento", nullable = false)
        private String procedimientos;

        @Column(name = "medicamentos", nullable = false)
        private String medicamentos;

        //Aqui falta un @ManyToOne o un @OneToMany o un @OneToOne todo depende de como este relacionada sus bases de datos
        @ManyToOne
        @JoinColumn
        private PacienteEntity codigoPaciente;

        @ManyToOne
        @JoinColumn
        private PropietarioEntity codigoPropietario;

}
