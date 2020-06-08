package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPropietario;

import java.util.List;

import com.veterinaria.veterinaria.aplicacion.factory.FactoryPropietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioListarPropietario {

    @Autowired
    public RepositorioPropietario repositorioPropietario;

    @Autowired
    public FactoryPropietario factoryPropietario;

    public List<CommandPropietario> findAll() {
        return factoryPropietario.entityToCommand(repositorioPropietario.listar());
    }
}
