package com.veterinaria.veterinaria.dominio.repositoriopuerto;

import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import com.veterinaria.veterinaria.infraestructura.entidad.PropietarioEntity;

import java.util.List;

public interface RepositorioPropietario {

    List<PropietarioEntity> listar();

    void guardar(Propietario propietario);
}
