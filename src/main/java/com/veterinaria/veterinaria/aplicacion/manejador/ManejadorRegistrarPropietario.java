package com.veterinaria.veterinaria.aplicacion.manejador;

import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.aplicacion.factory.FactoryPropietario;
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import com.veterinaria.veterinaria.dominio.servicio.ServicioCrearPropietario;
import org.springframework.stereotype.Component;

@Component
public class ManejadorRegistrarPropietario {

    private final ServicioCrearPropietario servicioCrearPropietario;
    private final FactoryPropietario factoryPropietario;

    public ManejadorRegistrarPropietario(ServicioCrearPropietario servicioCrearPropietario, FactoryPropietario factoryPropietario) {
        this.servicioCrearPropietario = servicioCrearPropietario;
        this.factoryPropietario = factoryPropietario;
    }

    public void ejecutar(CommandPropietario commandPropietario) {
        Propietario propietario = this.factoryPropietario.crear(commandPropietario);
        this.servicioCrearPropietario.ejecutar(propietario);
    }

}
