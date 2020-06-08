package com.veterinaria.veterinaria.infraestructura.repositoriojpa;

import com.veterinaria.veterinaria.infraestructura.entidad.HistoriaClinicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioHistoriaClinicaJpa extends JpaRepository<HistoriaClinicaEntity, Integer> {

}
