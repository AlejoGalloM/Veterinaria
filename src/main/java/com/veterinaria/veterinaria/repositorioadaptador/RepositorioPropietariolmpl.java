package com.veterinaria.veterinaria.repositorioadaptador;

import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPropietario;
import com.veterinaria.veterinaria.entidad.PropietarioEntity;
import com.veterinaria.veterinaria.repositoriojpa.RepositorioPropietarioJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioPropietariolmpl implements RepositorioPropietario {

    public RepositorioPropietarioJpa repositorioPropietarioJpa;

    public RepositorioPropietariolmpl (RepositorioPropietarioJpa repositorioPropietarioJpa){
        this.repositorioPropietarioJpa = repositorioPropietarioJpa;
    }

    @Override
    public List<PropietarioEntity> listar() { return repositorioPropietarioJpa.findAll(); }
}
