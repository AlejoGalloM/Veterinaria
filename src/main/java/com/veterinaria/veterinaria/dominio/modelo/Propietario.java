package com.veterinaria.veterinaria.dominio.modelo;

import com.veterinaria.veterinaria.dominio.util.ValidatorArgumento;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Email;
import java.io.Serializable;

@Getter
public class Propietario {

    public static final String TELEFONO_PROPIETARIO_OBLIGATORIO = "EL TELEFONO DEL PROPIETARIO NO ´PUEDE ESTAR VACIO";
    public static final String NOMBRE_PRIPIETARIO_OBLIGATORIO = "EL NOMBRE DEL PROPIETARIO NO PUEDE ESTAR VACIO";
    private String nombre;
    private String apellido;
    private String id;
    private String telefono;
    private String direccion;
    private Email Email;
    //Preferible utilizar Integer o Long en ves de Serialiazable
    private Serializable codigoPropietario;
    private Paciente codigoPaciente;
    private static final long serialVersionUID = 8799656478674716638L;

    public Propietario(String nombre, String apellido, String id, String telefono, String direccion, javax.validation.constraints.Email email, Serializable codigoPropietario, Paciente codigoPaciente) {
        //Aqui implementar los validadores de argumentos
        ValidatorArgumento.validarNombrePropietarioNulo(nombre, NOMBRE_PRIPIETARIO_OBLIGATORIO);


        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.telefono = telefono;
        this.direccion = direccion;
        Email = email;
        this.codigoPropietario = codigoPropietario;
        this.codigoPaciente = codigoPaciente;
    }
}

