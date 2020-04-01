package com.veterinaria.veterinaria.modelo;

import com.veterinaria.veterinaria.util.ValidatorArgumento;

import java.io.Serializable;

public class Paciente {

    private static final String ESPECIE_PACIENTE_REQUERIDA = "LA ESPECIE DEL PACIENTE NO PUEDE ESTAR VACIA";
    private static final String RAZA_PACIENTE_REQUERIDA = "LA RAZA DEL PACIENTE NO PUEDE ESTAR VACIA";
    private static final String PESO_PACIENTE_REQUERIDA = "EL PESO DEL PACIENTE NO PUEDE ESTAR VACIO";

    private String nombre;
    private String especie;
    private String raza;
    private Integer peso;
    private Propietario propietario;
    private Serializable codigoPaciente;

    public Paciente(String nombre, String especie, String raza, Integer peso, Propietario propietario,
                    Serializable codigoPaciente) {
        ValidatorArgumento.validarEspecieNula(especie,ESPECIE_PACIENTE_REQUERIDA);
        ValidatorArgumento.validarRazaNula(raza, RAZA_PACIENTE_REQUERIDA);
        ValidatorArgumento.validarPesoNulo(peso,PESO_PACIENTE_REQUERIDA);
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.peso = peso;
        this.propietario = propietario;
        this.codigoPaciente = codigoPaciente;
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

    public Propietario getPropietario() {
        return propietario;
    }

    public Serializable getCodigoPaciente() {
        return codigoPaciente;
    }
}


