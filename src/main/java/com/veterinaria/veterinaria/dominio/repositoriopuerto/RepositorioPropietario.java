package com.veterinaria.veterinaria.dominio.repositoriopuerto;

import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import com.veterinaria.veterinaria.infraestructura.entidad.PropietarioEntity;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioPropietarioJpa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RepositorioPropietario{

    List<PropietarioEntity> listar();

    void guardar(Propietario propietario);

    @Query("select PropietarioEntity from PropietarioEntity  where PropietarioEntity.nombre like :nombre")
    List<CommandPropietario> buscaPorNombre(@Param("nombre") String nombre);

    @Query("select PropietarioEntity from PropietarioEntity  where PropietarioEntity.id = id")
    CommandPropietario buscarPorId(@Param("id") Integer id);
}

