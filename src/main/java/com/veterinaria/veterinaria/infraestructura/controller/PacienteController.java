package com.veterinaria.veterinaria.infraestructura.controller;

import com.veterinaria.veterinaria.aplicacion.command.CommandPaciente;
import com.veterinaria.veterinaria.dominio.servicio.*;
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
    public ServicioListarPacientePorPropietario servicioListarPacientePorPropietario;

    @Autowired
    public ServicioListarPacientePorEspecie servicioListarPacientePorEspecie;

    @Autowired
    public ServicioActualizarPaciente servicioActualizarPaciente;

    @Autowired
    public ServicioListarPacientePorRaza servicioListarPacientePorRaza;

    @Autowired
    public RepositorioPacienteJpa repositorioPacienteJpa;

    @GetMapping()
    public List<CommandPaciente> listar() {
        return servicioListarPaciente.findAll();
    }


    @PostMapping()
    public void registroPaciente(@RequestBody CommandPaciente commandPaciente) {
        servicioCrearPaciente.registrarPaciente(commandPaciente);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminarPaciente(@PathVariable Integer id) {
        repositorioPacienteJpa.deleteById(id);
    }

    @PutMapping(value = "/{id}")
    public void actualizarPaciente(@PathVariable Integer id, @RequestBody CommandPaciente paciente) {
        servicioActualizarPaciente.ejecutar(paciente);
    }

    @GetMapping(value = "/buscar/propietario/{idPropietario}")
    public List<CommandPaciente> listarPacientesPorPropietario(@PathVariable Integer idPropietario) {
        return servicioListarPacientePorPropietario.ejecutar(idPropietario);
    }

    @GetMapping(value = "/buscar/especie/{especie}")
    public List<CommandPaciente> listarPacientesPorEspecie(@PathVariable String especie) {
        return servicioListarPacientePorEspecie.ejecutar(especie);
    }

    @GetMapping(value = "/buscar/raza/{raza}")
    public List<CommandPaciente> listarPacientesPorRaza(@PathVariable String raza) {
        return servicioListarPacientePorRaza.ejecutar(raza);
    }

}
