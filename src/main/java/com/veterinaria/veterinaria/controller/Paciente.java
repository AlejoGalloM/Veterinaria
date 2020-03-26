package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.bussinesException.BussinesException;
import com.veterinaria.veterinaria.util.Validator;

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

    private Paciente() {
        super();
    }

    public static class pacienteBuilder {
        private String nombre;
        private String especie;
        private String raza;
        private Integer peso;
        private Propietario propietario;
        private Serializable codigoPaciente;

        public pacienteBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public pacienteBuilder setEspecie(String especie) {
            this.especie = especie;
            return this;
        }

        public pacienteBuilder setRaza(String raza) {
            this.raza = raza;
            return this;
        }

        public pacienteBuilder setPeso(Integer peso) {
            this.peso = peso;
            return this;
        }

        public pacienteBuilder setPropietario(Propietario propietario) {
            this.propietario = propietario;
            return this;
        }

        public pacienteBuilder setCodigoPorpietario(Serializable codigoPaciente) {
            this.codigoPaciente = codigoPaciente;
            return this;
        }

        public Paciente build() throws BussinesException {
            Paciente paciente = new Paciente();
            paciente.nombre = this.nombre;
            Validator.validarEspecie(especie, ESPECIE_PACIENTE_REQUERIDA);
            paciente.especie = this.especie;
            Validator.validarRaza(raza, RAZA_PACIENTE_REQUERIDA);
            paciente.raza = this.raza;
            Validator.validarPeso(peso, PESO_PACIENTE_REQUERIDA);
            paciente.peso = this.peso;
            paciente.codigoPaciente = this.codigoPaciente;
            paciente.propietario = this.propietario;

            return paciente;
        }
    }
}

