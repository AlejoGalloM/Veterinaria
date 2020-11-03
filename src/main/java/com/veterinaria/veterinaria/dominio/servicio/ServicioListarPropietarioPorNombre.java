package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPropietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioListarPropietarioPorNombre {
    @Autowired
    private RepositorioPropietario repositorioPropietario;

    public List<CommandPropietario> ejecutar(String nombre){
        return this.repositorioPropietario.buscaPorNombre(nombre);
    }
}
