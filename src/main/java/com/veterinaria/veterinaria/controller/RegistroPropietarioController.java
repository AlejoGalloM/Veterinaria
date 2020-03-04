package com.veterinaria.veterinaria.controller;

import javax.validation.constraints.Email;

public class RegistroPropietarioController {

    private String nombre;
    private String apellido;
    private  String telefono;
    private String direccion;
    private Email Email;
    private RegistroPacienteController paciente;

    public RegistroPropietarioController(String nombre, String apellido, String telefono,
                                         String direccion, Email email, RegistroPacienteController paciente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.Email = email;
        this.paciente = paciente;
    }
}
