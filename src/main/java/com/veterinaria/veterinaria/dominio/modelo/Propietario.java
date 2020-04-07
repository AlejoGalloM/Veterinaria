package com.veterinaria.veterinaria.dominio.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Email;
import java.io.Serializable;

@Getter
@AllArgsConstructor
public class Propietario {

    public static final String TELEFONO_PROPIETARIO_OBLIGATORIO = "EL TELEFONO DEL PROPIETARIO NO ´PUEDE ESTAR VACIO";
    public static final String NOMBRE_PRIPIETARIO_OBLIGATORIO = "EL NOMBRE DEL PROPIETARIO NO PUEDE ESTAR VACIO";
    private String nombre;
    private String apellido;
    private String id;
    private String telefono;
    private String direccion;
    private Email Email;
    private Serializable codigoPropietario;
    private Paciente codigoPaciente;
    private static final long serialVersionUID = 8799656478674716638L;

}

