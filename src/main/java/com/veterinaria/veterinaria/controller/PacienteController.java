package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.command.CommandPaciente;
import com.veterinaria.veterinaria.dominio.servicio.impl.ServicioListarPaciente;
import com.veterinaria.veterinaria.entidad.PacienteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {

    @Autowired
    public ServicioListarPaciente servicioListarPaciente;

    @GetMapping(value = "/listar")
    public List<CommandPaciente> listar() {
        return servicioListarPaciente.findAll();
    }
}
