package com.veterinaria.veterinaria.dominio.modelo;

<<<<<<< Updated upstream
=======
import com.veterinaria.veterinaria.infraestructura.entidad.PacienteEntity;
import com.veterinaria.veterinaria.infraestructura.entidad.PropietarioEntity;
>>>>>>> Stashed changes
import lombok.Setter;

import java.io.Serializable;

@Setter
public class HistoriaClinicaTestDataBuilder implements IHistoriaClinica {

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
