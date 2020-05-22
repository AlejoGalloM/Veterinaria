package com.veterinaria.veterinaria.command;

import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import com.veterinaria.veterinaria.entidad.PropietarioEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter @NoArgsConstructor @AllArgsConstructor @Setter
public class CommandPaciente {

    private String nombre;
    private String especie;
    private String raza;
    private int peso;
    private PropietarioEntity propietario;
    private Integer codigoPaciente;

}
