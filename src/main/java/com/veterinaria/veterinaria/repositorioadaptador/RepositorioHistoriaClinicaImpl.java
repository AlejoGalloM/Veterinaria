package com.veterinaria.veterinaria.repositorioadaptador;

import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioHistoriaClinica;
import com.veterinaria.veterinaria.entidad.HistoriaClinicaEntity;
import com.veterinaria.veterinaria.repositoriojpa.RepositorioHistoriaClinicaJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioHistoriaClinicaImpl {


    @Autowired
    public RepositorioHistoriaClinicaJpa repositorioHistoriaClinicaJpa;


    public List<HistoriaClinicaEntity> listar() {
        return repositorioHistoriaClinicaJpa.findAll();
    }
}
