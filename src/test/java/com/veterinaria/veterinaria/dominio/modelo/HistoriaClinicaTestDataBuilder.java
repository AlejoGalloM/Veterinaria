package com.veterinaria.veterinaria.dominio.modelo;

import lombok.Setter;

@Setter
public class HistoriaClinicaTestDataBuilder implements IHistoriaClinica  {

    private String procedimientos;
    private String medicamentos;
    private Paciente codigoPaciente;
    private Propietario codigoPropietario;
    private Integer codigoHistoria;


    @Override
    public HistoriaClinica build() {
        return new HistoriaClinica(this.codigoHistoria, this.procedimientos, this.medicamentos,
                this.codigoPaciente, this.codigoPropietario);
    }
}
