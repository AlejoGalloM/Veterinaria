package com.veterinaria.veterinaria.testDataBuilder.modelo;



import com.veterinaria.veterinaria.dominio.util.ValidatorArgumento;

import javax.validation.constraints.Email;
import java.io.Serializable;

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

    public Propietario(String nombre, String apellido, String id, String telefono, String direccion,
                       javax.validation.constraints.Email email, Serializable codigoPropietario,
                       Paciente codigoPaciente) {
        ValidatorArgumento.validarNombrePropietarioNulo(nombre,NOMBRE_PRIPIETARIO_OBLIGATORIO);
        ValidatorArgumento.validarTelefonoNulo(telefono,TELEFONO_PROPIETARIO_OBLIGATORIO);
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.telefono = telefono;
        this.direccion = direccion;
        Email = email;
        this.codigoPropietario = codigoPropietario;
        this.codigoPaciente = codigoPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId() {
        return id;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public javax.validation.constraints.Email getEmail() {
        return Email;
    }

    public Serializable getCodigoPropietario() {
        return codigoPropietario;
    }

    public Paciente getCodigoPaciente() {
        return codigoPaciente;
    }
}

