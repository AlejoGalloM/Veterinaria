package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.aplicacion.factory.FactoryPropietario;
import com.veterinaria.veterinaria.infraestructura.entidad.PropietarioEntity;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioPropietarioJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioBuscarPropietarioPorId {

    @Autowired
    private RepositorioPropietarioJpa repositorioPropietarioJpa;

    @Autowired
    private FactoryPropietario factoryPropietario;

    public CommandPropietario ejecutar(Integer id){
        return factoryPropietario.entityToCommand(repositorioPropietarioJpa.buscarPorId(id));
    }
}
