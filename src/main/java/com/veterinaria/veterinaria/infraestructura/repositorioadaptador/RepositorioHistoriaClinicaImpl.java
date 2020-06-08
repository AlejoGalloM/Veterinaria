package com.veterinaria.veterinaria.infraestructura.repositorioadaptador;

<<<<<<< Updated upstream:src/main/java/com/veterinaria/veterinaria/repositorioadaptador/RepositorioHistoriaClinicaImpl.java
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioHistoriaClinica;
import com.veterinaria.veterinaria.entidad.HistoriaClinicaEntity;
import com.veterinaria.veterinaria.repositoriojpa.RepositorioHistoriaClinicaJpa;
=======
import com.veterinaria.veterinaria.infraestructura.entidad.HistoriaClinicaEntity;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioHistoriaClinicaJpa;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> Stashed changes:src/main/java/com/veterinaria/veterinaria/infraestructura/repositorioadaptador/RepositorioHistoriaClinicaImpl.java
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
