package com.veterinaria.veterinaria.infraestructura.repositorioadaptador;

import com.veterinaria.veterinaria.infraestructura.entidad.HistoriaClinicaEntity;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioHistoriaClinicaJpa;
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
