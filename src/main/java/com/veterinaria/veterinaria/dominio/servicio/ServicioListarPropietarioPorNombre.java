package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.aplicacion.factory.FactoryPropietario;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPropietario;
import com.veterinaria.veterinaria.infraestructura.entidad.PropietarioEntity;
import com.veterinaria.veterinaria.infraestructura.repositorioadaptador.RepositorioPropietariolmpl;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioPropietarioJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioListarPropietarioPorNombre {
    @Autowired
    private RepositorioPropietarioJpa repositorioPropietarioJpa;

    @Autowired
    private FactoryPropietario factoryPropietario;


    public List<CommandPropietario> ejecutar(String nombre){
        List<PropietarioEntity> propietariosConNombre = repositorioPropietarioJpa.buscaPorNombre(nombre);
        return factoryPropietario.entityToCommand(propietariosConNombre);

    }
}
