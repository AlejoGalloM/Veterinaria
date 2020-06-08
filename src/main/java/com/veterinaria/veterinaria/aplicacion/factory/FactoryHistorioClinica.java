package com.veterinaria.veterinaria.aplicacion.factory;

<<<<<<< Updated upstream:src/main/java/com/veterinaria/veterinaria/factory/FactoryHistorioClinica.java
import com.veterinaria.veterinaria.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.dominio.modelo.HistoriaClinica;
=======
import com.veterinaria.veterinaria.aplicacion.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.infraestructura.entidad.HistoriaClinicaEntity;
>>>>>>> Stashed changes:src/main/java/com/veterinaria/veterinaria/aplicacion/factory/FactoryHistorioClinica.java
import org.springframework.stereotype.Component;

@Component
public class FactoryHistorioClinica {

    public HistoriaClinica crear(CommandHistoriaClinica commandHistoriaClinica) {
        return new HistoriaClinica(commandHistoriaClinica.getCodigoHistoria(),
                commandHistoriaClinica.getProcedimientos(), commandHistoriaClinica.getMedicamentos(),
                commandHistoriaClinica.getCodigoPaciente(), commandHistoriaClinica.getCodigoPropietario());
    }
}
