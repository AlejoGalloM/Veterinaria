package com.veterinaria.veterinaria.dominio.servicio.impl;

import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPaciente;
import com.veterinaria.veterinaria.entidad.PacienteEntity;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServicioListarPaciente {

    public RepositorioPaciente repositorioPaciente;

    public ServicioListarPaciente(RepositorioPaciente repositorioPaciente) {
        this.repositorioPaciente = repositorioPaciente;
    }

    public List<PacienteEntity> ejecutar() {
        return repositorioPaciente.listar();
    }
}
