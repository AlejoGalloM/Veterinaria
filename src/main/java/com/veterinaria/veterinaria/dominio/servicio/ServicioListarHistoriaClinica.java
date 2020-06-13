package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.aplicacion.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.aplicacion.factory.FactoryHistorioClinica;
import com.veterinaria.veterinaria.infraestructura.repositorioadaptador.RepositorioHistoriaClinicaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioListarHistoriaClinica {

    @Autowired
    private RepositorioHistoriaClinicaImpl repositorioHistoriaClinica;

    @Autowired
    private FactoryHistorioClinica factoryHistorioClinica;

    public List<CommandHistoriaClinica> findAll() {
        return factoryHistorioClinica.entityToCommand(repositorioHistoriaClinica.listar());

    }

}
