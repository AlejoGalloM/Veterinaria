package com.veterinaria.veterinaria.infraestructura.controller;

import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.aplicacion.manejador.ManejadorRegistrarPropietario;
import com.veterinaria.veterinaria.dominio.servicio.ServicioCrearPropietario;
import com.veterinaria.veterinaria.dominio.servicio.ServicioListarPropietario;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/propietario")
public class PropietarioController {

    private final ManejadorRegistrarPropietario manejadorRegistrarPropietario;
    private final ServicioListarPropietario servicioListarPropietario;
    private final ServicioCrearPropietario servicioCrearPropietario;

    public PropietarioController(ManejadorRegistrarPropietario manejadorRegistrarPropietario,
                                 ServicioListarPropietario servicioListarPropietario,
                                 ServicioCrearPropietario servicioCrearPropietario) {
        this.manejadorRegistrarPropietario = manejadorRegistrarPropietario;
        this.servicioListarPropietario = servicioListarPropietario;
        this.servicioCrearPropietario = servicioCrearPropietario;
    }

    @GetMapping()
    public List<CommandPropietario> listar() { return servicioListarPropietario.findAll();}

    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE )
    @ResponseStatus(HttpStatus.OK)
    public void registroPropietario(@RequestBody CommandPropietario commandPropietario){
        this.manejadorRegistrarPropietario.ejecutar(commandPropietario);
    }
}
