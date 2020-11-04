package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.aplicacion.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.aplicacion.factory.FactoryHistorioClinica;
import com.veterinaria.veterinaria.dominio.modelo.HistoriaClinica;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioHistoriaClinicaJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioListarHistoriaClinicaPorFecha {

    @Autowired
    RepositorioHistoriaClinicaJpa repositorioHistoriaClinicaJpa;

    @Autowired
    FactoryHistorioClinica factoryHistorioClinica;

    public List<CommandHistoriaClinica> ejecutar(String fecha){
        return factoryHistorioClinica.entityToCommand(repositorioHistoriaClinicaJpa.buscarPorFecha(fecha));
    }
}
