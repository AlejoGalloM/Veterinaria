package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.dominio.servicio.impl.ServicioListarHistoriaClinica;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/historia-clinica")
public class HistoriaClinicaController {

    public ServicioListarHistoriaClinica servicioListarHistoriaClinica;

    public HistoriaClinicaController(ServicioListarHistoriaClinica servicioListarHistoriaClinica) {
        this.servicioListarHistoriaClinica = servicioListarHistoriaClinica;
    }

    @GetMapping(value = "/listar")
    public List<CommandHistoriaClinica> listar(){
       return servicioListarHistoriaClinica.findAll();
    }
}
