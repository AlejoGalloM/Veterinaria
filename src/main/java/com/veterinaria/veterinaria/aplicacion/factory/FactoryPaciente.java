package com.veterinaria.veterinaria.aplicacion.factory;

<<<<<<< Updated upstream:src/main/java/com/veterinaria/veterinaria/factory/FactoryPaciente.java
import com.veterinaria.veterinaria.command.CommandPaciente;
import com.veterinaria.veterinaria.dominio.modelo.Paciente;
=======
import com.veterinaria.veterinaria.aplicacion.command.CommandPaciente;
import com.veterinaria.veterinaria.infraestructura.entidad.PacienteEntity;
>>>>>>> Stashed changes:src/main/java/com/veterinaria/veterinaria/aplicacion/factory/FactoryPaciente.java
import org.springframework.stereotype.Component;

@Component
public class FactoryPaciente {

    public Paciente crear(CommandPaciente commandPaciente) {
        return new Paciente(commandPaciente.getNombre(), commandPaciente.getEspecie(),
                commandPaciente.getRaza(), commandPaciente.getPeso(), commandPaciente.getPropietario(),
                commandPaciente.getCodigoPaciente());
    }
}
