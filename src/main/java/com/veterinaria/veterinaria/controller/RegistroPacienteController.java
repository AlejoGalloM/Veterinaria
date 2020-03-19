package com.veterinaria.veterinaria.controller;

import java.io.Serializable;

public class RegistroPacienteController {
    private static final long serialVersionUID = 8799656478674716638L;
    private String nombre;
    private String especie;
    private String raza;
    private Integer peso;
    private RegistroPropietarioController propietario;
    private Serializable codigoPorpietario;

    public RegistroPacienteController(String nombre, String especie,
                                      String raza, Integer peso, RegistroPropietarioController propietario,
                                      Serializable codigoPorpietario) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.peso = peso;
        this.propietario = propietario;
        this.codigoPorpietario = codigoPorpietario;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getPeso() {
        return peso;
    }

    public RegistroPropietarioController getPropietario() {
        return propietario;
    }

    public Serializable getCodigoPorpietario() {
        return codigoPorpietario;
    }
}