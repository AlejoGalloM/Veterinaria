package com.veterinaria.veterinaria.infraestructura.repositorioadaptador;

import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPropietario;
import com.veterinaria.veterinaria.infraestructura.entidad.PropietarioEntity;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioPropietarioJpa;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class RepositorioPropietariolmpl implements RepositorioPropietario {

    private final ModelMapper modelMapper = new ModelMapper();


    public RepositorioPropietarioJpa repositorioPropietarioJpa;
    public RepositorioPropietario repositorioPropietario;

    public RepositorioPropietariolmpl (RepositorioPropietarioJpa repositorioPropietarioJpa){
        this.repositorioPropietarioJpa = repositorioPropietarioJpa;
    }

    @Override
    public List<PropietarioEntity> listar() { return repositorioPropietarioJpa.findAll(); }

    @Override
    public void guardar(Propietario propietario) {
        PropietarioEntity propietarioEntity = modelMapper.map(propietario ,PropietarioEntity.class);
        repositorioPropietarioJpa.save(propietarioEntity);
    }

    @Override
    public void eliminar(CommandPropietario propietario) {
        PropietarioEntity propietarioEntity = modelMapper.map(propietario ,PropietarioEntity.class);
        repositorioPropietarioJpa.delete(propietarioEntity);
    }

    @Override
    public void actualizar(CommandPropietario propietario) {
        PropietarioEntity propietarioEntity = new PropietarioEntity();
        propietarioEntity.setId(propietario.getId());
        propietarioEntity.setNombre(propietario.getNombre());
        propietarioEntity.setApellido(propietario.getApellido());
        propietarioEntity.setTelefono(propietario.getTelefono());
        propietarioEntity.setEmail(propietario.getEmail());
        propietarioEntity.setDireccion(propietario.getDireccion());
        //PropietarioEntity propietarioEntity = modelMapper.map(propietario ,PropietarioEntity.class);
        repositorioPropietarioJpa.save(propietarioEntity);
    }

    @Override
    public List<CommandPropietario> buscaPorNombre(String nombre) {
        return repositorioPropietario.buscaPorNombre(nombre);
    }

    @Override
    public CommandPropietario buscarPorId(Integer id) {
        return null;
    }
}
