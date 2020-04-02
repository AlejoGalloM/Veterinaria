package com.veterinaria.veterinaria.dominio.modelo;

import java.io.Serializable;

public class PacienteTestDataBuilder {
    private String nombre;
    private String especie;
    private String raza;
    private Integer peso;
    private Propietario propietario;
    private Serializable codigoPaciente;
    private static final long serialVersionUID = 8799656478674716638L;

    public PacienteTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PacienteTestDataBuilder conEspecie(String especie) {
        this.especie = especie;
        return this;
    }

    public PacienteTestDataBuilder conRaza(String raza) {
        this.raza = raza;
        return this;
    }

    public PacienteTestDataBuilder conPeso(Integer peso) {
        this.peso = peso;
        return this;
    }

    public PacienteTestDataBuilder conPropietario(Propietario propietario) {
        this.propietario = propietario;
        return this;
    }

    public PacienteTestDataBuilder conCodigoPaciente(Serializable codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
        return this;
    }

    public Paciente build() {
        return new Paciente(this.nombre, this.especie, this.raza, this.peso, this.propietario, this.codigoPaciente);
    }
}
