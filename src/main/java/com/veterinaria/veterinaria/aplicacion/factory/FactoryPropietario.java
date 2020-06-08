package com.veterinaria.veterinaria.aplicacion.factory;

import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
<<<<<<< Updated upstream:src/main/java/com/veterinaria/veterinaria/factory/FactoryPropietario.java
=======
import com.veterinaria.veterinaria.infraestructura.entidad.PropietarioEntity;
>>>>>>> Stashed changes:src/main/java/com/veterinaria/veterinaria/aplicacion/factory/FactoryPropietario.java
import org.springframework.stereotype.Component;

@Component
public class FactoryPropietario {

<<<<<<< Updated upstream:src/main/java/com/veterinaria/veterinaria/factory/FactoryPropietario.java
    public Propietario craar(CommandPropietario commandPropietario){
        return new Propietario(commandPropietario.getNombre(), commandPropietario.getApellido(),
        		commandPropietario.getDireccion(),commandPropietario.getEmail(),commandPropietario.getId(),
        		commandPropietario.getTelefono());
=======
    public List<CommandPropietario> entityToCommand(List<PropietarioEntity> listaPropietario) {
        List<CommandPropietario> listaCommandPropietario = new ArrayList<>();
        for (PropietarioEntity propietarioEntity : listaPropietario) {
            listaCommandPropietario.add(entityToCommand(propietarioEntity));
        }
        return listaCommandPropietario;
    }

    private CommandPropietario entityToCommand(PropietarioEntity propietarioEntity) {
        CommandPropietario commandPropietario = new CommandPropietario();
        commandPropietario.setId(propietarioEntity.getId());
        commandPropietario.setNombre(propietarioEntity.getNombre());
        commandPropietario.setApellido(propietarioEntity.getApellido());
        commandPropietario.setDireccion(propietarioEntity.getDireccion());
        commandPropietario.setEmail(propietarioEntity.getEmail());
        commandPropietario.setTelefono(propietarioEntity.getTelefono());
        return commandPropietario;
>>>>>>> Stashed changes:src/main/java/com/veterinaria/veterinaria/aplicacion/factory/FactoryPropietario.java
    }

    public Propietario crear(CommandPropietario commandPropietario) {
        return new Propietario(commandPropietario.getNombre(), commandPropietario.getApellido(),
                commandPropietario.getId(), commandPropietario.getTelefono(),
                commandPropietario.getDireccion(), commandPropietario.getEmail());
    }
}
