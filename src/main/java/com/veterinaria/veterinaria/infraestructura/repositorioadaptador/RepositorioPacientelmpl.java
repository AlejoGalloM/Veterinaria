package com.veterinaria.veterinaria.infraestructura.repositorioadaptador;

import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPaciente;
import com.veterinaria.veterinaria.infraestructura.entidad.PacienteEntity;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioPacienteJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.modelmapper.ModelMapper;


@Repository
public class RepositorioPacientelmpl implements RepositorioPaciente {

    private final ModelMapper modelMapper = new ModelMapper();
    public RepositorioPacienteJpa repositorioPacienteJpa;

    public RepositorioPacientelmpl(RepositorioPacienteJpa repositorioPacienteJpa) {
        this.repositorioPacienteJpa = repositorioPacienteJpa;
    }

    @Override
    public List<PacienteEntity> listar() {
        return repositorioPacienteJpa.findAll();
    }

    @Override
    public void save(PacienteEntity pacienteEntity) {
        repositorioPacienteJpa.save(pacienteEntity);
    }

}
