package com.veterinaria.veterinaria.dominio.repositoriopuerto;

import com.veterinaria.veterinaria.entidad.HistoriaClinicaEntity;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface RepositorioHistoriaClinica {

    List<HistoriaClinicaEntity> listar();
}
