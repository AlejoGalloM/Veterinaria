package com.veterinaria.veterinaria.dominio.modelo;

import lombok.Getter;

import com.veterinaria.veterinaria.dominio.util.ValidadorArgumento;

@Getter
public class Paciente {

    private static final String ESPECIE_PACIENTE_REQUERIDA = "LA ESPECIE DEL PACIENTE NO PUEDE ESTAR VACIA";
    private static final String RAZA_PACIENTE_REQUERIDA = "LA RAZA DEL PACIENTE NO PUEDE ESTAR VACIA";
    private static final String PESO_PACIENTE_REQUERIDA = "EL PESO DEL PACIENTE NO PUEDE ESTAR VACIO";

    private String nombre;
    private String especie;
    private String raza;
    private int peso;
    private Propietario propietario;
    private Integer codigoPaciente;

    public Paciente(String nombre, String especie, String raza, int peso, Propietario propietario,
                    Integer codigoPaciente) {

        ValidadorArgumento.validarEspecieNula(especie, ESPECIE_PACIENTE_REQUERIDA);
        ValidadorArgumento.validarPesoNulo(peso, PESO_PACIENTE_REQUERIDA);
        ValidadorArgumento.validarRazaNula(raza, RAZA_PACIENTE_REQUERIDA);
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.peso = peso;
        this.propietario = propietario;
        this.codigoPaciente = codigoPaciente;
    }
}
