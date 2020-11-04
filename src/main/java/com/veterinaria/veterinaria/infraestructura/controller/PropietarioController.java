package com.veterinaria.veterinaria.infraestructura.controller;

import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.aplicacion.manejador.ManejadorActualizarPropietario;
import com.veterinaria.veterinaria.aplicacion.manejador.ManejadorRegistrarPropietario;
import com.veterinaria.veterinaria.dominio.servicio.*;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioPropietarioJpa;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/propietario")
public class PropietarioController {

    private final ManejadorRegistrarPropietario manejadorRegistrarPropietario;
    private final ManejadorActualizarPropietario manejadorActualizarPropietario;
    private final ServicioListarPropietario servicioListarPropietario;
    private final ServicioCrearPropietario servicioCrearPropietario;
    private final ServicioActualizarPropietario servicioActualizarPropietario;
    private final ServicioListarPropietarioPorNombre servicioListarPropietarioPorNombre;
    private final RepositorioPropietarioJpa repositorioPropietarioJpa;

    public PropietarioController(ManejadorRegistrarPropietario manejadorRegistrarPropietario,
                                 ManejadorActualizarPropietario manejadorActualizarPropietario,
                                 ServicioListarPropietario servicioListarPropietario,
                                 ServicioCrearPropietario servicioCrearPropietario,
                                 ServicioActualizarPropietario servicioActualizarPropietario,
                                 ServicioListarPropietarioPorNombre servicioListarPropietarioPorNombre,
                                 RepositorioPropietarioJpa repositorioPropietarioJpa) {
        this.manejadorRegistrarPropietario = manejadorRegistrarPropietario;
        this.manejadorActualizarPropietario = manejadorActualizarPropietario;
        this.servicioListarPropietario = servicioListarPropietario;
        this.servicioCrearPropietario = servicioCrearPropietario;
        this.servicioActualizarPropietario = servicioActualizarPropietario;
        this.servicioListarPropietarioPorNombre = servicioListarPropietarioPorNombre;
        this.repositorioPropietarioJpa = repositorioPropietarioJpa;
    }

    @GetMapping()
    public List<CommandPropietario> listar() { return servicioListarPropietario.findAll();}

    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE )
    @ResponseStatus(HttpStatus.OK)
    public void registroPropietario(@RequestBody CommandPropietario commandPropietario){
        this.manejadorRegistrarPropietario.ejecutar(commandPropietario);
    }

    @GetMapping("/buscar/{nombre}")
    public List<CommandPropietario> listarPorNombre(@PathVariable String nombre) { return this.servicioListarPropietarioPorNombre.ejecutar(nombre);}

    @DeleteMapping(value = "/{id}" )
    public void eliminarPropietario(@PathVariable Integer id){
        repositorioPropietarioJpa.deleteById(id);
    }

    @PutMapping(value = "/{id}")
    public void actualizarPropietario(@PathVariable Integer id, @RequestBody CommandPropietario propietario){

        this.manejadorActualizarPropietario.ejecutar(propietario, id);

    }
}
