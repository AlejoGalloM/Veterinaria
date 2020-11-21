package com.veterinaria.veterinaria.infraestructura.controller;

import com.veterinaria.veterinaria.aplicacion.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.dominio.servicio.ServicioCrearHistoriaClinica;
import com.veterinaria.veterinaria.dominio.servicio.ServicioListarHistoriaClinica;
import com.veterinaria.veterinaria.dominio.servicio.ServicioListarHistoriaClinicaPorFecha;
import com.veterinaria.veterinaria.dominio.servicio.ServicioListarHistoriaClinicaPorPaciente;
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
    public ServicioListarHistoriaClinicaPorFecha servicioListarHistoriaClinicaPorFecha;

    @Autowired
    public ServicioListarHistoriaClinicaPorPaciente servicioListarHistoriaClinicaPorPaciente;

    @Autowired
    public RepositorioHistoriaClinicaJpa repositorioHistoriaClinicaJpa;


    @GetMapping()
    public List<CommandHistoriaClinica> listar() {
        return servicioListarHistoriaClinica.findAll();
    }

    @PostMapping()
    public void regitrarHistoriaClinica(@RequestBody CommandHistoriaClinica commandHistoriaClinica) {
        servicioCrearHistoriaClinica.registrarHistoriaClinica(commandHistoriaClinica);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminarHistoriaClinica(@PathVariable Integer id) {
        repositorioHistoriaClinicaJpa.deleteById(id);
    }

    @PutMapping(value = "/{id}")
    public void actualizarHistoriaClinica(@PathVariable Integer id, @RequestBody CommandHistoriaClinica commandHistoriaClinica) {
       servicioCrearHistoriaClinica.registrarHistoriaClinica(commandHistoriaClinica);
    }

    @GetMapping(value = "/buscar/{fecha}")
    public List<CommandHistoriaClinica> listarHistoriaClinicaPorFecha(@PathVariable String fecha) {
        return servicioListarHistoriaClinicaPorFecha.ejecutar(fecha);
    }

    @GetMapping(value = "/buscar/{idPaciente}")
    public List<CommandHistoriaClinica> listarHistoriaClinicaPorPaciente(@PathVariable Integer idPaciente) {
        return servicioListarHistoriaClinicaPorPaciente.ejecutar(idPaciente);
    }


}
