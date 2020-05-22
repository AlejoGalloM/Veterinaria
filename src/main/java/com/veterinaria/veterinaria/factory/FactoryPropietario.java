package com.veterinaria.veterinaria.factory;

import com.veterinaria.veterinaria.command.CommandPropietario;
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import com.veterinaria.veterinaria.entidad.PropietarioEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FactoryPropietario {

    public List<CommandPropietario> entityToCommand(List<PropietarioEntity> listaPropietario) {
        List<CommandPropietario> listaCommandPropietario = new ArrayList<>();
        for(PropietarioEntity propietarioEntity : listaPropietario){
            listaCommandPropietario.add(entityToCommand(propietarioEntity));
        }
        return listaCommandPropietario;
    }

    private CommandPropietario entityToCommand(PropietarioEntity propietarioEntity){
        CommandPropietario commandPropietario = new CommandPropietario();
        commandPropietario.setId(propietarioEntity.getId());
        commandPropietario.setNombre(propietarioEntity.getNombre());
        commandPropietario.setApellido(propietarioEntity.getApellido());
        commandPropietario.setDireccion(propietarioEntity.getDireccion());
        commandPropietario.setEmail(propietarioEntity.getEmail());
        commandPropietario.setTelefono(propietarioEntity.getTelefono());
        return commandPropietario;
    }
}
