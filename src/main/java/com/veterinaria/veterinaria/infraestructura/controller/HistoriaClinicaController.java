package com.veterinaria.veterinaria.infraestructura.controller;

import com.veterinaria.veterinaria.aplicacion.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.aplicacion.command.CommandPaciente;
import com.veterinaria.veterinaria.dominio.servicio.ServicioActualizarHistoriaClinica;
import com.veterinaria.veterinaria.dominio.servicio.ServicioCrearHistoriaClinica;
import com.veterinaria.veterinaria.dominio.servicio.ServicioEliminarHistoriaClinica;
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
    public ServicioActualizarHistoriaClinica servicioActualizarHistoriaClinica;

    @Autowired
    public ServicioEliminarHistoriaClinica servicioEliminarHistoriaClinica;

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

    @DeleteMapping("/{id}/eliminar" )
    public void eliminarPaciente(@PathVariable Integer id){
        CommandHistoriaClinica commandHistoriaClinica = null;
        for (CommandHistoriaClinica historiaClinica: listar())
        {
            if (historiaClinica.getCodigoHistoria().equals(id)){
                commandHistoriaClinica = historiaClinica;
            }
        }
        servicioEliminarHistoriaClinica.ejecutar(commandHistoriaClinica);
    }

    @PutMapping("/{id}/actualizar")
    public void actualizarPaciente(@PathVariable Integer id){
        CommandHistoriaClinica commandHistoriaClinica = null;
        for (CommandHistoriaClinica historiaClinica: listar())
        {
            if (historiaClinica.getCodigoHistoria().equals(id)){
                commandHistoriaClinica = historiaClinica;
            }
        }
        servicioActualizarHistoriaClinica.ejecutar(commandHistoriaClinica);
    }


}
