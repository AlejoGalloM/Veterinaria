package com.veterinaria.veterinaria.testDataBuilder.modelo;

import com.veterinaria.veterinaria.dominio.util.ValidatorArgumento;

import java.io.Serializable;

public class HistoriaClinica {
    public static final String MEDICAMENTOS_REQUERIDOS = "LOS MEDICAMENTOS APLICADOS O RESETADOS DEBEN SER ESPABLECIDOS";
    public static final String PROCEDIMIENTOS_REQUERIDOS = "LOS PROCEDIMIENTOS REALIZADOS DEBEN  SER ACLARADOS";

    private String procedimientos;
    private String medicamentos;
    private Paciente codigoPaciente;
    private Propietario codigoPropietario;
    private Serializable codigoHistoria;
    private static final long serialVersionUID = 8799656478674716638L;

    public HistoriaClinica(String procedimientos, String medicamentos, Paciente codigoPaciente,
                           Propietario codigoPropietario, Serializable codigoHistoria)  {
        ValidatorArgumento.validarProcedimientoNulo(procedimientos,PROCEDIMIENTOS_REQUERIDOS);
        ValidatorArgumento.validarMedicamentoNulo(medicamentos,MEDICAMENTOS_REQUERIDOS);
        this.procedimientos = procedimientos;
        this.medicamentos = medicamentos;
        this.codigoPaciente = codigoPaciente;
        this.codigoPropietario = codigoPropietario;
        this.codigoHistoria = codigoHistoria;
    }

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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
