package com.veterinaria.veterinaria.aplicacion.command;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class CommandHistoriaClinica {

    private Integer codigoHistoria;
    private String procedimientos;
    private String medicamentos;
    private Integer codigoPaciente;
    private Integer codigoPropietario;


}
