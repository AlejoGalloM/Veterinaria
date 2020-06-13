package com.veterinaria.veterinaria.infraestructura.controller;

import com.veterinaria.veterinaria.aplicacion.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.dominio.servicio.ServicioCrearHistoriaClinica;
import com.veterinaria.veterinaria.dominio.servicio.ServicioListarHistoriaClinica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/historia-clinica")
public class HistoriaClinicaController {

    @Autowired
    public ServicioListarHistoriaClinica servicioListarHistoriaClinica;

    @Autowired
    public ServicioCrearHistoriaClinica servicioCrearHistoriaClinica;

    @GetMapping(value = "/listar")
    public List<CommandHistoriaClinica> listar(){
       return servicioListarHistoriaClinica.findAll();
    }

    @PostMapping("/registrar")
    public String regitrarHistoriaClinica(@RequestBody  CommandHistoriaClinica commandHistoriaClinica){
        return servicioCrearHistoriaClinica.registrarHistoriaClinica(commandHistoriaClinica);
    }
}
