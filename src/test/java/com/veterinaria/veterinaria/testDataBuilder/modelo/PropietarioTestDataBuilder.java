package com.veterinaria.veterinaria.testDataBuilder.modelo;

import java.io.Serializable;

public class PropietarioTestDataBuilder implements IPropietario {
    private String nombre;
    private String apellido;
    private String id;
    private String telefono;
    private String direccion;
    private javax.validation.constraints.Email Email;
    private Serializable codigoPropietario;
    private Paciente codigoPaciente;

    public PropietarioTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PropietarioTestDataBuilder conApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public PropietarioTestDataBuilder conId(String id) {
        this.id = id;
        return this;
    }

    public PropietarioTestDataBuilder conTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public PropietarioTestDataBuilder conDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public PropietarioTestDataBuilder conEmail(javax.validation.constraints.Email email) {
        Email = email;
        return this;
    }

    public PropietarioTestDataBuilder conCodigoPropietario(Serializable codigoPropietario) {
        this.codigoPropietario = codigoPropietario;
        return this;
    }

    public PropietarioTestDataBuilder conCodigoPaciente(Paciente codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
        return this;
    }

    @Override
    public Propietario build(){
        return new Propietario(this.nombre,this.apellido,this.id,this.telefono,this.direccion,this.Email,this.codigoPropietario,this.codigoPaciente);
    }
}
