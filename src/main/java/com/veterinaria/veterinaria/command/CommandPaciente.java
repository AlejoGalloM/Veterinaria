package com.veterinaria.veterinaria.command;

import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter @NoArgsConstructor @AllArgsConstructor
public class CommandPaciente {

    private String nombre;
    private String especie;
    private String raza;
    private int peso;
    private Propietario propietario;
    private Integer codigoPaciente;

}
