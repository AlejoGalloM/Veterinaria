package com.veterinaria.veterinaria.aplicacion.command;

import com.veterinaria.veterinaria.dominio.modelo.Paciente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;

@Getter @NoArgsConstructor @AllArgsConstructor
public class CommandPropietario {

    private String nombre;
    private String apellido;
    private String id;
    private String telefono;
    private String direccion;
    private String Email;

}
