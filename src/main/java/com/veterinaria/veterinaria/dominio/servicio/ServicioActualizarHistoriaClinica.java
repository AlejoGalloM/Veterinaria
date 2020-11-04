package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.infraestructura.repositorioadaptador.RepositorioHistoriaClinicaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarHistoriaClinica {

    @Autowired
    private RepositorioHistoriaClinicaImpl repositorioHistoriaClinica;

}
