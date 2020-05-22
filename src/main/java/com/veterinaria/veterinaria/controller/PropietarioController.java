package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.command.CommandPropietario;
import com.veterinaria.veterinaria.dominio.servicio.impl.ServicioListarPropietario;
import com.veterinaria.veterinaria.entidad.PropietarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/propietario")
public class PropietarioController {

    @Autowired
    public ServicioListarPropietario servicioListarPropietario;


    @GetMapping(value = "/listar")
    public List<CommandPropietario> listar() { return servicioListarPropietario.findAll();}
}
