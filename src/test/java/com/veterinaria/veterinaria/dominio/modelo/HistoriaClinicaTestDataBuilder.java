package com.veterinaria.veterinaria.dominio.modelo;

import lombok.Setter;

import java.io.Serializable;

@Setter
public class HistoriaClinicaTestDataBuilder implements IHistoriaClinica {

    private String procedimientos;
    private String medicamentos;
    private Paciente codigoPaciente;
    private Propietario codigoPropietario;
    private Serializable codigoHistoria;

    @Override
    public HistoriaClinica build() {
        return new HistoriaClinica(this.procedimientos, this.medicamentos, this.codigoPaciente,
                this.codigoPropietario, this.codigoHistoria);
    }
}
