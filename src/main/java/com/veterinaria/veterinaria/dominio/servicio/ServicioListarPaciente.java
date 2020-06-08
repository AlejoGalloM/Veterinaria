package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.aplicacion.command.CommandPaciente;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPaciente;

import java.util.List;

import com.veterinaria.veterinaria.aplicacion.factory.FactoryPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioListarPaciente {

    @Autowired
    public RepositorioPaciente repositorioPaciente;

    @Autowired
    public FactoryPaciente factoryPaciente;

    public List<CommandPaciente> findAll() {
        return factoryPaciente.entityToCommand(repositorioPaciente.listar());

    }


}
