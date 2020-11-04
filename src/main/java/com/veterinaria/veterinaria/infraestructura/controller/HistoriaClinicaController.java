package com.veterinaria.veterinaria.infraestructura.controller;

import com.veterinaria.veterinaria.aplicacion.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.dominio.servicio.ServicioCrearHistoriaClinica;
import com.veterinaria.veterinaria.dominio.servicio.ServicioListarHistoriaClinica;
import com.veterinaria.veterinaria.infraestructura.repositoriojpa.RepositorioHistoriaClinicaJpa;
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

    @Autowired
    public RepositorioHistoriaClinicaJpa repositorioHistoriaClinicaJpa;

    @GetMapping()
    public List<CommandHistoriaClinica> listar() {
        return servicioListarHistoriaClinica.findAll();
    }

    @PostMapping()
    public String regitrarHistoriaClinica(@RequestBody CommandHistoriaClinica commandHistoriaClinica) {
        return servicioCrearHistoriaClinica.registrarHistoriaClinica(commandHistoriaClinica);
    }

    @DeleteMapping("/{id}")
    public void eliminarHistoriaClinica(@PathVariable Integer id) {
        repositorioHistoriaClinicaJpa.deleteById(id);
    }

    @PutMapping("/{id}")
    public void actualizarHistoriaClinica(@PathVariable Integer id, @RequestBody CommandHistoriaClinica commandHistoriaClinica) {
        servicioCrearHistoriaClinica.registrarHistoriaClinica(commandHistoriaClinica);
    }


}
