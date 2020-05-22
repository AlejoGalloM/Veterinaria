package com.veterinaria.veterinaria.repositoriojpa;

import com.veterinaria.veterinaria.entidad.HistoriaClinicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioHistoriaClinicaJpa extends JpaRepository<HistoriaClinicaEntity, Integer> {

}
