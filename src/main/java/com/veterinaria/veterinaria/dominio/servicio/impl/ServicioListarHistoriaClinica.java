package com.veterinaria.veterinaria.dominio.servicio.impl;

import com.veterinaria.veterinaria.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioHistoriaClinica;
import com.veterinaria.veterinaria.dominio.servicio.HistoriaClinicaService;
import com.veterinaria.veterinaria.entidad.HistoriaClinicaEntity;
import com.veterinaria.veterinaria.factory.FactoryHistorioClinica;
import com.veterinaria.veterinaria.repositorioadaptador.RepositorioHistoriaClinicaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioListarHistoriaClinica implements HistoriaClinicaService {

    @Autowired
    private RepositorioHistoriaClinicaImpl repositorioHistoriaClinica;

    @Autowired
    private FactoryHistorioClinica factoryHistorioClinica;

    @Override
    public List<CommandHistoriaClinica> findAll() {
        factoryHistorioClinica.entityToCommand(repositorioHistoriaClinica.listar());
        return null;
    }




}
