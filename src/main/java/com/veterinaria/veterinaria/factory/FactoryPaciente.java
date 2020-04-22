package com.veterinaria.veterinaria.factory;

import com.veterinaria.veterinaria.command.CommandPaciente;
import com.veterinaria.veterinaria.dominio.modelo.Paciente;
import org.springframework.stereotype.Component;

@Component
public class FactoryPaciente {

    public Paciente crear(CommandPaciente commandPaciente) {
        return new Paciente(commandPaciente.getNombre(), commandPaciente.getEspecie(),
                commandPaciente.getRaza(), commandPaciente.getPeso(), commandPaciente.getPropietario(),
                commandPaciente.getCodigoPaciente());
    }
}
