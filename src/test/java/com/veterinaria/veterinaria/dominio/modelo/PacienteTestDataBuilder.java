package com.veterinaria.veterinaria.dominio.modelo;

import lombok.Setter;

import java.io.Serializable;

@Setter
public class PacienteTestDataBuilder implements IPaciente {
    private String nombre;
    private String especie;
    private String raza;
    private Integer peso;
    private Propietario propietario;
    private Integer codigoPaciente;
    private static final long serialVersionUID = 8799656478674716638L;


    @Override
    public Paciente build() {
        return new Paciente(this.nombre, this.especie, this.raza, this.peso,
                this.propietario, this.codigoPaciente);
    }
}
