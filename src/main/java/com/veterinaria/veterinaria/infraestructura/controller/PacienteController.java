package com.veterinaria.veterinaria.infraestructura.controller;

import com.veterinaria.veterinaria.aplicacion.command.CommandPaciente;
import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.dominio.servicio.ServicioActualizarPaciente;
import com.veterinaria.veterinaria.dominio.servicio.ServicioCrearPaciente;
import com.veterinaria.veterinaria.dominio.servicio.ServicioEliminarPaciente;
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

    @Autowired
    public ServicioEliminarPaciente servicioEliminarPaciente;

    @Autowired
    public ServicioActualizarPaciente servicioActualizarPaciente;

    @GetMapping()
    public List<CommandPaciente> listar() {
        return servicioListarPaciente.findAll();
    }


    @PostMapping("/registrar")
    public String registroPaciente(@RequestBody CommandPaciente commandPaciente){
        return servicioCrearPaciente.registrarPaciente(commandPaciente);
    }

    @DeleteMapping("/{id}/eliminar" )
    public void eliminarPaciente(@PathVariable Integer id){
        CommandPaciente paciente = null;
        for (CommandPaciente pacienteID: listar())
        {
            if (pacienteID.getCodigoPaciente().equals(id)){
                paciente = pacienteID;
            }
        }
        servicioEliminarPaciente.ejecutar(paciente);
    }

    @PutMapping("/{id}/actualizar")
    public void actualizarPaciente(@PathVariable Integer id){
        CommandPaciente paciente = null;
        for (CommandPaciente pacienteID: listar())
        {
            if (pacienteID.getCodigoPaciente().equals(id)){
                paciente = pacienteID;
            }
        }
        servicioActualizarPaciente.ejecutar(paciente);
    }
}
