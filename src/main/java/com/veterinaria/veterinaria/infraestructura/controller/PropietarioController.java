package com.veterinaria.veterinaria.infraestructura.controller;

import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.aplicacion.manejador.ManejadorRegistrarPropietario;
import com.veterinaria.veterinaria.dominio.servicio.ServicioCrearPropietario;
import com.veterinaria.veterinaria.dominio.servicio.ServicioEliminarPropietario;
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
    private final ServicioEliminarPropietario servicioEliminarPropietario;

    public PropietarioController(ManejadorRegistrarPropietario manejadorRegistrarPropietario,
                                 ServicioListarPropietario servicioListarPropietario,
                                 ServicioCrearPropietario servicioCrearPropietario,
                                 ServicioEliminarPropietario servicioEliminarPropietario) {
        this.manejadorRegistrarPropietario = manejadorRegistrarPropietario;
        this.servicioListarPropietario = servicioListarPropietario;
        this.servicioCrearPropietario = servicioCrearPropietario;
        this.servicioEliminarPropietario = servicioEliminarPropietario;
    }

    @GetMapping()
    public List<CommandPropietario> listar() { return servicioListarPropietario.findAll();}

    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE )
    @ResponseStatus(HttpStatus.OK)
    public void registroPropietario(@RequestBody CommandPropietario commandPropietario){
        this.manejadorRegistrarPropietario.ejecutar(commandPropietario);
    }

    @DeleteMapping("/{id}/eliminar" )
    public void eliminarPropietario(@PathVariable Integer id){
        CommandPropietario propietario = null;
        for (CommandPropietario propietarioID: listar())
        {
          if (propietarioID.getId().equals(id)){
              propietario = propietarioID;
          }
        }
        servicioEliminarPropietario.ejecutar(propietario);
    }

    @PutMapping("/{id}/actualizar")
    public void actualizarPropietario(@PathVariable Integer id){
        CommandPropietario propietario = null;
        for (CommandPropietario propietarioID: listar())
        {
            if (propietarioID.getId().equals(id)){
                propietario = propietarioID;
            }
        }
        servicioEliminarPropietario.ejecutar(propietario);
    }
}
