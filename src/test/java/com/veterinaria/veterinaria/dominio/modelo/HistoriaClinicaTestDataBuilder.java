package com.veterinaria.veterinaria.dominio.modelo;

import com.veterinaria.veterinaria.infraestructura.entidad.PacienteEntity;
import com.veterinaria.veterinaria.infraestructura.entidad.PropietarioEntity;
import lombok.Setter;

@Setter
public class HistoriaClinicaTestDataBuilder implements IHistoriaClinica {

    private String procedimientos;
    private String medicamentos;
    private Integer codigoPaciente;
    private Integer codigoPropietario;
    private Integer codigoHistoria;


    @Override
    public HistoriaClinica build() {
        return new HistoriaClinica(this.codigoHistoria, this.procedimientos, this.medicamentos,
                this.codigoPaciente, this.codigoPropietario);
    }
}
