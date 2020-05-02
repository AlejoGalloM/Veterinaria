package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.dominio.servicio.impl.ServicioListarPaciente;
import com.veterinaria.veterinaria.entidad.PacienteEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {

    public ServicioListarPaciente servicioListarPaciente;

    public PacienteController(ServicioListarPaciente servicioListarPaciente) {
        this.servicioListarPaciente = servicioListarPaciente;
    }

    @GetMapping(value = "/listar")
    public List<PacienteEntity> listar() {
        return servicioListarPaciente.ejecutar();
    }
}
