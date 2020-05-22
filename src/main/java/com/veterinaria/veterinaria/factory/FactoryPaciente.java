package com.veterinaria.veterinaria.factory;

import com.veterinaria.veterinaria.command.CommandPaciente;
import com.veterinaria.veterinaria.dominio.modelo.Paciente;
import com.veterinaria.veterinaria.entidad.PacienteEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FactoryPaciente {


    public List<CommandPaciente> entityToCommand(List<PacienteEntity> listaPaciente) {
        List<CommandPaciente> listaCommandPaciente = new ArrayList<>();
        for(PacienteEntity pacienteEntity : listaPaciente){
            listaCommandPaciente.add(entityToCommand(pacienteEntity));
        }
        return listaCommandPaciente;
    }

    private CommandPaciente entityToCommand(PacienteEntity pacienteEntity){
        CommandPaciente commandPaciente = new CommandPaciente();
        commandPaciente.setCodigoPaciente(pacienteEntity.getCodigoPaciente());
        commandPaciente.setEspecie(pacienteEntity.getEspecie());
        commandPaciente.setNombre(pacienteEntity.getNombre());
        commandPaciente.setPeso(pacienteEntity.getPeso());
        commandPaciente.setPropietario(pacienteEntity.getCodigoPropietario());
        commandPaciente.setRaza(pacienteEntity.getRaza());
        return commandPaciente;
    }
}
