package com.veterinaria.veterinaria.command;

import com.veterinaria.veterinaria.dominio.modelo.Paciente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;

@Component
@Getter @NoArgsConstructor @AllArgsConstructor
public class CommandPropietario {

    private String nombre;
    private String apellido;
    private String id;
    private String telefono;
    private String direccion;
    private String Email;

}
