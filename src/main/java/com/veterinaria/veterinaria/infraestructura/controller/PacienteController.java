package com.veterinaria.veterinaria.infraestructura.controller;

<<<<<<< Updated upstream:src/main/java/com/veterinaria/veterinaria/controller/PacienteController.java
import com.veterinaria.veterinaria.dominio.servicio.ServicioListarPaciente;
import com.veterinaria.veterinaria.entidad.PacienteEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import com.veterinaria.veterinaria.aplicacion.command.CommandPaciente;
import com.veterinaria.veterinaria.dominio.servicio.ServicioCrearPaciente;
import com.veterinaria.veterinaria.dominio.servicio.ServicioListarPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
>>>>>>> Stashed changes:src/main/java/com/veterinaria/veterinaria/infraestructura/controller/PacienteController.java

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
