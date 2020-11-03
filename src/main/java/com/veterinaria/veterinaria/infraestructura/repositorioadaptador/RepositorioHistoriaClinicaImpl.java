package com.veterinaria.veterinaria.infraestructura.repositorioadaptador;

import com.veterinaria.veterinaria.aplicacion.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.aplicacion.command.CommandPaciente;
import com.veterinaria.veterinaria.dominio.modelo.HistoriaClinica;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioHistoriaClinica;
import com.veterinaria.veterinaria.infraestructura.entidad.HistoriaClinicaEntity;
import com.veterinaria.veterinaria.infraestructura.entidad.PacienteEntity;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioHistoriaClinicaJpa;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioHistoriaClinicaImpl {

    private final ModelMapper modelMapper = new ModelMapper();
    @Autowired
    public RepositorioHistoriaClinica repositorioHistoriaClinica;
    @Autowired
    public RepositorioHistoriaClinicaJpa repositorioHistoriaClinicaJpa;

    public List<HistoriaClinicaEntity> listar() {
        return repositorioHistoriaClinicaJpa.findAll();
    }

    public void eliminar(CommandHistoriaClinica historiaClinica) {
        HistoriaClinicaEntity historiaClinicaEntity = modelMapper.map(historiaClinica , HistoriaClinicaEntity.class);
        repositorioHistoriaClinica.delete(historiaClinicaEntity);
    }


    public void actualizar(CommandHistoriaClinica historiaClinica) {
        HistoriaClinicaEntity historiaClinicaEntity = modelMapper.map(historiaClinica , HistoriaClinicaEntity.class);
        repositorioHistoriaClinica.save(historiaClinicaEntity);
    }
}
