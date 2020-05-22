package com.veterinaria.veterinaria.dominio.repositoriopuerto;

import com.veterinaria.veterinaria.entidad.HistoriaClinicaEntity;
import com.veterinaria.veterinaria.repositoriojpa.RepositorioHistoriaClinicaJpa;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface RepositorioHistoriaClinica extends RepositorioHistoriaClinicaJpa {

    List<HistoriaClinicaEntity> listar();
}
