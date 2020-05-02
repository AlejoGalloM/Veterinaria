package com.veterinaria.veterinaria.dominio.servicio.impl;

import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPropietario;
import com.veterinaria.veterinaria.entidad.PropietarioEntity;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServicioListarPropietario {

    public RepositorioPropietario repositorioPropietario;

    public ServicioListarPropietario(RepositorioPropietario repositorioPropietario) {
        this.repositorioPropietario = repositorioPropietario;
    }

    public List<PropietarioEntity> ejecutar() {
        return repositorioPropietario.listar();
    }
}
