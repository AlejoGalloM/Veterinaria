package com.veterinaria.veterinaria.testDataBuilder.modelo;

import java.io.Serializable;

public class HistoriaClinicaTestDataBuilder implements IHistoriaClinica {

    private String procedimientos;
    private String medicamentos;
    private Paciente codigoPaciente;
    private Propietario codigoPropietario;
    private Serializable codigoHistoria;


    public HistoriaClinicaTestDataBuilder conProcedimientos(String procedimientos) {
        this.procedimientos = procedimientos;
        return this;
    }

    public HistoriaClinicaTestDataBuilder conMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
        return this;
    }

    public HistoriaClinicaTestDataBuilder conCodigoPaciente(Paciente codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
        return this;
    }

    public HistoriaClinicaTestDataBuilder conCodigoPropietario(Propietario codigoPropietario) {
        this.codigoPropietario = codigoPropietario;
        return this;
    }

    public HistoriaClinicaTestDataBuilder conCodigoHistoria(Serializable codigoHistoria) {
        this.codigoHistoria = codigoHistoria;
        return this;
    }

    @Override
    public HistoriaClinica build() {
        return new HistoriaClinica(this.procedimientos,this.medicamentos,this.codigoPaciente,
                this.codigoPropietario,this.codigoHistoria);
    }
}