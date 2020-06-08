package com.veterinaria.veterinaria.aplicacion.command;

<<<<<<< Updated upstream:src/main/java/com/veterinaria/veterinaria/command/CommandPaciente.java
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
=======
import com.veterinaria.veterinaria.infraestructura.entidad.PropietarioEntity;
>>>>>>> Stashed changes:src/main/java/com/veterinaria/veterinaria/aplicacion/command/CommandPaciente.java
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @NoArgsConstructor @AllArgsConstructor
public class CommandPaciente {

    private String nombre;
    private String especie;
    private String raza;
    private int peso;
    private Propietario propietario;
    private Integer codigoPaciente;

}
