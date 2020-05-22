package com.veterinaria.veterinaria.dominio.servicio.impl;

import com.veterinaria.veterinaria.command.CommandPropietario;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPropietario;
import com.veterinaria.veterinaria.entidad.PropietarioEntity;

import java.util.List;

import com.veterinaria.veterinaria.factory.FactoryPropietario;
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
