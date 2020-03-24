package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.bussinesException.BussinesException;
import com.veterinaria.veterinaria.util.Validator;

import java.io.Serializable;

public class HistoriaClinica {

    private static final String MEDICAMENTOS_REQUERIDOS = "LOS MEDICAMENTOS APLICADOS O RESETADOS DEBEN SER ESPABLECIDOS";
    private static final String PROCEDIMIENTOS_REQUERIDOS = "LOS PROCEDIMIENTOS REALIZADOS DEBEN  SER ACLARADOS";

    private String procedimientos;
    private String medicamentos;
    private RegistroPaciente codigoPaciente;
    private RegistroPropietario codigoPropietario;
    private Serializable codigoHistoria;

    public HistoriaClinica() {
        super();
    }

    public static class historiaBuilder {

        private String procedimientos;
        private String medicamentos;
        private RegistroPaciente codigoPaciente;
        private RegistroPropietario codigoPropietario;
        private Serializable codigoHistoria;

        public historiaBuilder setProcedimientos(String procedimientos) {
            this.procedimientos = procedimientos;
            return this;
        }

        public historiaBuilder setMedicamentos(String medicamentos) {
            this.medicamentos = medicamentos;
            return this;
        }

        public historiaBuilder setRegistroPaciente(RegistroPaciente codigoPaciente) {
            this.codigoPaciente = codigoPaciente;
            return this;
        }

        public historiaBuilder setRegistroPropietario(RegistroPropietario codigoPropietario) {
            this.codigoPropietario = codigoPropietario;
            return this;
        }

        public historiaBuilder setCodigoHistoria(Serializable codigoHistoria) {
            this.codigoHistoria = codigoHistoria;
            return this;
        }

        public HistoriaClinica build() throws BussinesException {
            HistoriaClinica historiaClinica = new HistoriaClinica();
            historiaClinica.codigoHistoria = this.codigoHistoria;
            Validator.validarMedicamentos(medicamentos, MEDICAMENTOS_REQUERIDOS);
            historiaClinica.medicamentos = this.medicamentos;
            Validator.validarProcedimientos(procedimientos, PROCEDIMIENTOS_REQUERIDOS);
            historiaClinica.procedimientos = this.procedimientos;
            historiaClinica.codigoPaciente = this.codigoPaciente;
            historiaClinica.codigoPropietario = this.codigoPropietario;

            return historiaClinica;
        }

    }
}
