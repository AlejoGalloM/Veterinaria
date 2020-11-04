package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPropietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarPropietario {

    @Autowired
    private RepositorioPropietario repositorioPropietario;

    public void ejecutar(Propietario propietario) {
        this.repositorioPropietario.guardar(propietario);
    }

}
