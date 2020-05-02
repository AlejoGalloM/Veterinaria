package com.veterinaria.veterinaria.command;

import com.veterinaria.veterinaria.dominio.modelo.Paciente;
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import com.veterinaria.veterinaria.entidad.PacienteEntity;
import com.veterinaria.veterinaria.entidad.PropietarioEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter @AllArgsConstructor @NoArgsConstructor
@Setter
public class CommandHistoriaClinica {

    private Integer codigoHistoria;
    private String procedimientos;
    private String medicamentos;
    private PacienteEntity codigoPaciente;
    private PropietarioEntity codigoPropietario;


}
