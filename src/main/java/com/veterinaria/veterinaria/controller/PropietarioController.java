package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.dominio.servicio.ServicioListarPropietario;
import com.veterinaria.veterinaria.entidad.PropietarioEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/propietario")
public class PropietarioController {

    public ServicioListarPropietario servicioListarPropietario;

    public PropietarioController(ServicioListarPropietario servicioListarPropietario) {
        this.servicioListarPropietario = servicioListarPropietario;
    }

    @GetMapping(value = "/listar")
    public List<PropietarioEntity> listar() {
        return servicioListarPropietario.ejecutar();
    }
}
