package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.command.CommandHistoriaClinica;

import java.util.List;

public interface HistoriaClinicaService {

    List<CommandHistoriaClinica> findAll();
}
