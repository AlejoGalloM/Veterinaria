package com.veterinaria.veterinaria.repositorioadaptador;

import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPaciente;
import com.veterinaria.veterinaria.entidad.PacienteEntity;
import com.veterinaria.veterinaria.repositoriojpa.RepositorioPacienteJpa;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class RepositorioPacientelmpl implements RepositorioPaciente {

    public RepositorioPacienteJpa repositorioPacienteJpa;

    public RepositorioPacientelmpl (RepositorioPacienteJpa repositorioPacienteJpa){
        this.repositorioPacienteJpa= repositorioPacienteJpa;
    }

    @Override
    public List<PacienteEntity> listar() { return  repositorioPacienteJpa.findAll(); }

    @Override
    public void save(PacienteEntity pacienteEntity) {
        repositorioPacienteJpa.save(pacienteEntity);
    }
}
