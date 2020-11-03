package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.aplicacion.command.CommandPaciente;
import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEliminarPaciente {
    @Autowired
    private RepositorioPaciente repositorioPaciente;

    public void ejecutar(CommandPaciente commandPaciente){
        this.repositorioPaciente.eliminar(commandPaciente);
    }

}
