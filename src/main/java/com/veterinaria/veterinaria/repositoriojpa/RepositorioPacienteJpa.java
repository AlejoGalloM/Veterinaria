package com.veterinaria.veterinaria.repositoriojpa;

import com.veterinaria.veterinaria.entidad.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioPacienteJpa extends JpaRepository<PacienteEntity, Serializable> {
}
