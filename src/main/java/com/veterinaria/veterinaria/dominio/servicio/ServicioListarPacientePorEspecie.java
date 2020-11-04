package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.aplicacion.command.CommandPaciente;
import com.veterinaria.veterinaria.aplicacion.factory.FactoryPaciente;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioPacienteJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioListarPacientePorEspecie {

    @Autowired
    RepositorioPacienteJpa repositorioPacienteJpa;

    @Autowired
    FactoryPaciente factoryPaciente;

    public List<CommandPaciente> ejecutar(String especie){
        return factoryPaciente.entityToCommand(repositorioPacienteJpa.buscarPorEspecie(especie));
    }
}
