package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.command.CommandPaciente;
import com.veterinaria.veterinaria.command.CommandPropietario;
import com.veterinaria.veterinaria.dominio.servicio.impl.ServicioCrearPaciente;
import com.veterinaria.veterinaria.dominio.servicio.impl.ServicioCrearPropietario;
import com.veterinaria.veterinaria.dominio.servicio.impl.ServicioListarPropietario;
import com.veterinaria.veterinaria.entidad.PropietarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/propietario")
public class PropietarioController {

    @Autowired
    public ServicioListarPropietario servicioListarPropietario;

    @Autowired
    public ServicioCrearPropietario servicioCrearPropietario;

    @GetMapping()
    public List<CommandPropietario> listar() { return servicioListarPropietario.findAll();}

    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE )
    @ResponseStatus(HttpStatus.OK)
    public String registroPropietario(@RequestBody CommandPropietario commandPropietario){
        return servicioCrearPropietario.registrarPropietario(commandPropietario);
    }
}
