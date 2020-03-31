package com.veterinaria.veterinaria.entity;

import com.veterinaria.veterinaria.bussinesException.BussinesException;
import com.veterinaria.veterinaria.util.Validator;

import java.io.Serializable;

public class HistoriaClinica {

    private static final String MEDICAMENTOS_REQUERIDOS = "LOS MEDICAMENTOS APLICADOS O RESETADOS DEBEN SER ESPABLECIDOS";
    private static final String PROCEDIMIENTOS_REQUERIDOS = "LOS PROCEDIMIENTOS REALIZADOS DEBEN  SER ACLARADOS";

    private String procedimientos;
    private String medicamentos;
    private Paciente codigoPaciente;
    private Propietario codigoPropietario;
    private Serializable codigoHistoria;

    private HistoriaClinica() {
        super();
    }

    public static class historiaBuilder {

        private String procedimientos;
        private String medicamentos;
        private Paciente codigoPaciente;
        private Propietario codigoPropietario;
        private Serializable codigoHistoria;
        private static final long serialVersionUID = 8799656478674716638L;

        public String getProcedimientos() {
            return procedimientos;
        }

        public String getMedicamentos() {
            return medicamentos;
        }

        public Paciente getCodigoPaciente() {
            return codigoPaciente;
        }

        public Propietario getCodigoPropietario() {
            return codigoPropietario;
        }

        public Serializable getCodigoHistoria() {
            return codigoHistoria;
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
