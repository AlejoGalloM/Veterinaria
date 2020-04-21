package com.veterinaria.veterinaria.repositorioadaptador;

import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioHistoriaClinica;
import com.veterinaria.veterinaria.entidad.HistoriaClinicaEntity;
import com.veterinaria.veterinaria.repositoriojpa.RepositorioHistoriaClinicaJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioHistoriaClinicaImpl implements RepositorioHistoriaClinica {

    public RepositorioHistoriaClinicaJpa repositorioHistoriaClinicaJpa;

    public RepositorioHistoriaClinicaImpl(RepositorioHistoriaClinicaJpa repositorioHistoriaClinicaJpa) {
        this.repositorioHistoriaClinicaJpa = repositorioHistoriaClinicaJpa;
    }

    @Override
    public List<HistoriaClinicaEntity> listar() {
        return repositorioHistoriaClinicaJpa.findAll();
    }
}
