package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.aplicacion.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.infraestructura.repositorioadaptador.RepositorioHistoriaClinicaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEliminarHistoriaClinica {

    @Autowired
    private RepositorioHistoriaClinicaImpl repositorioHistoriaClinica;

    public void ejecutar(CommandHistoriaClinica commandHistoriaClinica){
        this.repositorioHistoriaClinica.eliminar(commandHistoriaClinica);
    }

}
