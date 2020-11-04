package com.veterinaria.veterinaria.infraestructura.repositoriojpa;

import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.infraestructura.entidad.PropietarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface RepositorioPropietarioJpa extends JpaRepository<PropietarioEntity, Serializable> {
    @Query("select u from PropietarioEntity u  where u.nombre like :nombreBuscar%")
    List<PropietarioEntity> buscaPorNombre(@Param("nombreBuscar") String nombreBuscar);

    @Query("select u from PropietarioEntity u  where u.id = :id")
    PropietarioEntity buscarPorId(@Param("id") Integer id);
}
