package com.veterinaria.veterinaria.dominio.servicio.impl;

import com.veterinaria.veterinaria.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.command.CommandPaciente;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPaciente;
import com.veterinaria.veterinaria.entidad.PacienteEntity;

import java.util.List;

import com.veterinaria.veterinaria.factory.FactoryPaciente;
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

    public String registrarPaciente(CommandPaciente commandPaciente) {
        return "";
    }
}
