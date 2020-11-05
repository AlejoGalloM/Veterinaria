package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.aplicacion.command.CommandPaciente;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarPaciente {

    @Autowired
    private RepositorioPaciente repositorioPaciente;

    @Autowired
    private ServicioCrearPaciente servicioCrearPaciente;

    public String ejecutar(CommandPaciente paciente) {
        return this.servicioCrearPaciente.registrarPaciente(paciente);
    }
}
