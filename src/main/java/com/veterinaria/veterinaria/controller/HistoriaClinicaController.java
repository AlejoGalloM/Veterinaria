package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.dominio.servicio.ServicioListarHistoriaClinica;
import com.veterinaria.veterinaria.entidad.HistoriaClinicaEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/historia-clinica")
public class HistoriaClinicaController {

    public ServicioListarHistoriaClinica servicioListarHistoriaClinica;

    public HistoriaClinicaController(ServicioListarHistoriaClinica servicioListarHistoriaClinica) {
        this.servicioListarHistoriaClinica = servicioListarHistoriaClinica;
    }

    @GetMapping(value = "/listar")
    public List<HistoriaClinicaEntity> listar(){
       return servicioListarHistoriaClinica.ejecutar();
    }
}
