package com.veterinaria.veterinaria.factory;

import com.veterinaria.veterinaria.command.CommandPropietario;
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import org.springframework.stereotype.Component;

@Component
public class FactoryPropietario {

    public Propietario craar(CommandPropietario commandPropietario){
        return new Propietario(commandPropietario.getNombre(), commandPropietario.getApellido(),
        		commandPropietario.getDireccion(),commandPropietario.getEmail(),commandPropietario.getId(),
        		commandPropietario.getTelefono());
    }
}
