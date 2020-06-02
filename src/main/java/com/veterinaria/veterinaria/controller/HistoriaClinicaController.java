package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.dominio.servicio.impl.ServicioListarHistoriaClinica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/historia-clinica")
public class HistoriaClinicaController {

    @Autowired
    public ServicioListarHistoriaClinica servicioListarHistoriaClinica;

    @GetMapping(value = "/listar")
    public List<CommandHistoriaClinica> listar(){
       return servicioListarHistoriaClinica.findAll();
    }

    @PostMapping("/registrar")
    public String regitrarHistoriaClinica(@RequestBody  CommandHistoriaClinica commandHistoriaClinica){
        return servicioListarHistoriaClinica.registrarHistoriaClinica(commandHistoriaClinica);
    }
}
