package com.veterinaria.veterinaria.dominio.modelo;

import com.veterinaria.veterinaria.entidad.PacienteEntity;
import com.veterinaria.veterinaria.entidad.PropietarioEntity;
import lombok.Setter;

@Setter
public class HistoriaClinicaTestDataBuilder implements IHistoriaClinica  {

    private String procedimientos;
    private String medicamentos;
    private PacienteEntity codigoPaciente;
    private PropietarioEntity codigoPropietario;
    private Integer codigoHistoria;


    @Override
    public HistoriaClinica build() {
        return new HistoriaClinica(this.codigoHistoria, this.procedimientos, this.medicamentos,
                this.codigoPaciente, this.codigoPropietario);
    }
}
