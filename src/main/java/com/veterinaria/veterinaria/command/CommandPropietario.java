package com.veterinaria.veterinaria.command;

import com.veterinaria.veterinaria.dominio.modelo.Paciente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;

@Component
@Getter @NoArgsConstructor @AllArgsConstructor @Setter
public class CommandPropietario {

    private String nombre;
    private String apellido;
    private Integer id;
    private String telefono;
    private String direccion;
    private String Email;

}
