package com.veterinaria.veterinaria.infraestructura.controller;

import com.veterinaria.veterinaria.aplicacion.command.CommandPaciente;
import com.veterinaria.veterinaria.dominio.servicio.ServicioActualizarPaciente;
import com.veterinaria.veterinaria.dominio.servicio.ServicioCrearPaciente;
import com.veterinaria.veterinaria.dominio.servicio.ServicioListarPaciente;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioPacienteJpa;
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


    @Autowired
    public ServicioActualizarPaciente servicioActualizarPaciente;

    @Autowired
    public RepositorioPacienteJpa repositorioPacienteJpa;

    @GetMapping()
    public List<CommandPaciente> listar() {
        return servicioListarPaciente.findAll();
    }


    @PostMapping()
    public void registroPaciente(@RequestBody CommandPaciente commandPaciente){
        servicioCrearPaciente.registrarPaciente(commandPaciente);
    }

    @DeleteMapping(value = "/{id}" )
    public void eliminarPaciente(@PathVariable Integer id){
        repositorioPacienteJpa.deleteById(id);
    }

    @PutMapping(value = "/{id}")
    public void actualizarPaciente(@PathVariable Integer id, @RequestBody CommandPaciente paciente){
        servicioActualizarPaciente.ejecutar(paciente);
    }
}
