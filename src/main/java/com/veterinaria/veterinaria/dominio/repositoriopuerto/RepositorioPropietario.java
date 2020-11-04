package com.veterinaria.veterinaria.dominio.repositoriopuerto;

import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import com.veterinaria.veterinaria.infraestructura.entidad.PropietarioEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RepositorioPropietario {

    List<PropietarioEntity> listar();

    void guardar(Propietario propietario);

    void eliminar(CommandPropietario propietario);

    void actualizar(CommandPropietario propietario);



}

