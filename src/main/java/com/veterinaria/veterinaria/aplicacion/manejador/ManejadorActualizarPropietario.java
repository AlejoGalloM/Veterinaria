package com.veterinaria.veterinaria.aplicacion.manejador;

import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.aplicacion.factory.FactoryPropietario;
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import com.veterinaria.veterinaria.dominio.servicio.ServicioActualizarPropietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarPropietario {

    @Autowired
    private ServicioActualizarPropietario servicioActualizarPropietario;

    @Autowired
    private FactoryPropietario factoryPropietario;

    public void ejecutar(CommandPropietario commandPropietario, Integer id) {
        commandPropietario.setId(id);
        commandPropietario.setNombre(commandPropietario.getNombre());
        commandPropietario.setApellido(commandPropietario.getApellido());
        commandPropietario.setTelefono(commandPropietario.getTelefono());
        commandPropietario.setDireccion(commandPropietario.getDireccion());
        commandPropietario.setEmail(commandPropietario.getEmail());

        Propietario propietario = this.factoryPropietario.crear(commandPropietario);
        this.servicioActualizarPropietario.ejecutar(propietario);

    }
}
