package com.veterinaria.veterinaria.command;

import com.veterinaria.veterinaria.dominio.modelo.Paciente;
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter @AllArgsConstructor @NoArgsConstructor
public class CommandHistoriaClinica {

    private Integer codigoHistoria;
    private String procedimientos;
    private String medicamentos;
    private Paciente codigoPaciente;
    private Propietario codigoPropietario;


}
