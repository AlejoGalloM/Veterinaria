package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.aplicacion.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.aplicacion.factory.FactoryHistorioClinica;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioHistoriaClinicaJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioListarHistoriaClinicaPorPaciente {

    @Autowired
    RepositorioHistoriaClinicaJpa  repositorioHistoriaClinicaJpa;

    @Autowired
    FactoryHistorioClinica factoryHistorioClinica;

    public List<CommandHistoriaClinica> ejecutar(Integer idPaciente){
        return factoryHistorioClinica.entityToCommand(repositorioHistoriaClinicaJpa.buscarPorPaciente(idPaciente));
    }
}
