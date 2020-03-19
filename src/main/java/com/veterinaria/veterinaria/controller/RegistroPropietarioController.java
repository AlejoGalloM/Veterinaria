package com.veterinaria.veterinaria.controller;

import javax.validation.constraints.Email;
import java.io.Serializable;

public class RegistroPropietarioController {

    private static final long serialVersionUID = 8799656478674716638L;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private Email Email;
    private Serializable codigoPropietario;
    private RegistroPacienteController paciente;

    public RegistroPropietarioController(String nombre, String apellido, String telefono, String direccion,
                                         javax.validation.constraints.Email email,
                                         Serializable codigoPropietario, RegistroPacienteController paciente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        Email = email;
        this.codigoPropietario = codigoPropietario;
        this.paciente = paciente;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
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

    public RegistroPacienteController getPaciente() {
        return paciente;
    }
}
