package com.veterinaria.veterinaria.controller;

import java.io.Serializable;

public class CrearHistoriaClinicaController {
    private static final long serialVersionUID = 8799656478674716638L;
    private String procedimientos;
    private String Medicamentos;
    private RegistroPacienteController registroPaciente;
    private RegistroPropietarioController registroPropietario;
    private Serializable codigoHistoria;

    public CrearHistoriaClinicaController(String procedimientos, String medicamentos,
                                          RegistroPacienteController registroPaciente,
                                          RegistroPropietarioController registroPropietario,
                                          Serializable codigoHistoria) {
        this.procedimientos = procedimientos;
        Medicamentos = medicamentos;
        this.registroPaciente = registroPaciente;
        this.registroPropietario = registroPropietario;
        this.codigoHistoria = codigoHistoria;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getProcedimientos() {
        return procedimientos;
    }

    public String getMedicamentos() {
        return Medicamentos;
    }

    public RegistroPacienteController getRegistroPaciente() {
        return registroPaciente;
    }

    public RegistroPropietarioController getRegistroPropietario() {
        return registroPropietario;
    }

    public Serializable getCodigoHistoria() {
        return codigoHistoria;
    }
}
