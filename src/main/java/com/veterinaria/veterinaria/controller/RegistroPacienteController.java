package com.veterinaria.veterinaria.controller;

public class RegistroPacienteController {

    private String nombre;
    private String especie;
    private String raza;
    private Integer peso;
    private RegistroPropietarioController propietario;

    public RegistroPacienteController(String nombre, String especie,
                                      String raza, Integer peso, RegistroPropietarioController propietario) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.peso = peso;
        this.propietario = propietario;
    }
}
