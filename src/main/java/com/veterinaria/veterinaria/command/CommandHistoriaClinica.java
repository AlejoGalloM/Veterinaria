package com.veterinaria.veterinaria.command;

import com.veterinaria.veterinaria.dominio.modelo.Paciente;
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @AllArgsConstructor @NoArgsConstructor
public class CommandHistoriaClinica {

    //Estos atributos deben ser los mismos del modelo
    private Integer codigoHistoria;
    private String procedimientos;
    private String medicamentos;
    private Paciente codigoPaciente;
    private Propietario codigoPropietario;


}
