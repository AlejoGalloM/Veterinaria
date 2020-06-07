package com.veterinaria.veterinaria.dominio.repositoriopuerto;

import com.veterinaria.veterinaria.entidad.PacienteEntity;

import java.util.List;

public interface RepositorioPaciente {

    List<PacienteEntity> listar();


    void save(PacienteEntity pacienteEntity);
}
