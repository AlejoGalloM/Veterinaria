package com.veterinaria.veterinaria.infraestructura.repositoriojpa;

import com.veterinaria.veterinaria.infraestructura.entidad.HistoriaClinicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioHistoriaClinicaJpa extends JpaRepository<HistoriaClinicaEntity, Integer> {

    @Query("SELECT u FROM HistoriaClinicaEntity u WHERE u.fecha LIKE :fecha")
    List<HistoriaClinicaEntity> buscarPorFecha(@Param("fecha") String fecha);

    @Query("SELECT u FROM HistoriaClinicaEntity u WHERE u.codigoPaciente = :idPaciente")
    List<HistoriaClinicaEntity> buscarPorPaciente(@Param("idPaciente") Integer idPaciente);
}
