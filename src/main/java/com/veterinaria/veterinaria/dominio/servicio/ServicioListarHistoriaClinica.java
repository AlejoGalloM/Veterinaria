package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioHistoriaClinica;
import com.veterinaria.veterinaria.entidad.HistoriaClinicaEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioListarHistoriaClinica {

    public RepositorioHistoriaClinica repositorioHistoriaClinica;

    public ServicioListarHistoriaClinica(RepositorioHistoriaClinica repositorioHistoriaClinica) {
        this.repositorioHistoriaClinica = repositorioHistoriaClinica;
    }

    public List<HistoriaClinicaEntity> ejecutar() {
        return repositorioHistoriaClinica.listar();
    }
}
