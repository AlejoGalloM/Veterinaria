package com.veterinaria.veterinaria.infraestructura.controller;

<<<<<<< Updated upstream:src/main/java/com/veterinaria/veterinaria/controller/HistoriaClinicaController.java
import com.veterinaria.veterinaria.dominio.servicio.ServicioListarHistoriaClinica;
import com.veterinaria.veterinaria.entidad.HistoriaClinicaEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import com.veterinaria.veterinaria.aplicacion.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.dominio.servicio.ServicioListarHistoriaClinica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
>>>>>>> Stashed changes:src/main/java/com/veterinaria/veterinaria/infraestructura/controller/HistoriaClinicaController.java

import java.util.List;

@RestController
@RequestMapping(value = "/historia-clinica")
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
