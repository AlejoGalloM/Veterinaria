package com.veterinaria.veterinaria.infraestructura.controller;

import com.veterinaria.veterinaria.aplicacion.command.CommandPaciente;
import com.veterinaria.veterinaria.dominio.servicio.ServicioCrearPaciente;
import com.veterinaria.veterinaria.dominio.servicio.ServicioListarPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {

    @Autowired
    public ServicioListarPaciente servicioListarPaciente;

    @Autowired
    public ServicioCrearPaciente servicioCrearPaciente;

    @GetMapping()
    public List<CommandPaciente> listar() {
        return servicioListarPaciente.findAll();
    }


    @PostMapping("/registrar")
    public String registroPaciente(@RequestBody CommandPaciente commandPaciente){
        return servicioCrearPaciente.registrarPaciente(commandPaciente);
    }
}