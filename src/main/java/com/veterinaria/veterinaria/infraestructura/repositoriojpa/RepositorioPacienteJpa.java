package com.veterinaria.veterinaria.infraestructura.repositoriojpa;

import com.veterinaria.veterinaria.infraestructura.entidad.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface RepositorioPacienteJpa extends JpaRepository<PacienteEntity, Serializable> {

    @Query("SELECT u FROM  PacienteEntity u WHERE u.codigoPropietario = :idPropietario")
    List<PacienteEntity> buscarPorIdPropietario(@Param("idPropietario") Integer idPropietario);

    @Query("SELECT u FROM  PacienteEntity u WHERE u.especie LIKE :especie%")
    List<PacienteEntity> buscarPorEspecie(@Param("especie") String especie);

    @Query("SELECT u FROM  PacienteEntity u WHERE u.raza LIKE :raza%")
    List<PacienteEntity> buscarPorRaza(@Param("raza") String raza);
}
