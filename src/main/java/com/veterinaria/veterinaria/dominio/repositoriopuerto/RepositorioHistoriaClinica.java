package com.veterinaria.veterinaria.dominio.repositoriopuerto;

import com.veterinaria.veterinaria.infraestructura.entidad.HistoriaClinicaEntity;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioHistoriaClinicaJpa;

import java.util.List;


public interface RepositorioHistoriaClinica extends RepositorioHistoriaClinicaJpa {

    List<HistoriaClinicaEntity> listar();
}
