package com.veterinaria.veterinaria.aplicacion.command;

<<<<<<< Updated upstream:src/main/java/com/veterinaria/veterinaria/command/CommandHistoriaClinica.java
import com.veterinaria.veterinaria.dominio.modelo.Paciente;
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
=======
import com.veterinaria.veterinaria.infraestructura.entidad.PacienteEntity;
import com.veterinaria.veterinaria.infraestructura.entidad.PropietarioEntity;
>>>>>>> Stashed changes:src/main/java/com/veterinaria/veterinaria/aplicacion/command/CommandHistoriaClinica.java
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @AllArgsConstructor @NoArgsConstructor
public class CommandHistoriaClinica {

    //Estos atributos deben ser los mismos del modelo
    private Integer codigoHistoria;
    private String procedimientos;
    private String medicamentos;
    private Paciente codigoPaciente;
    private Propietario codigoPropietario;


}
