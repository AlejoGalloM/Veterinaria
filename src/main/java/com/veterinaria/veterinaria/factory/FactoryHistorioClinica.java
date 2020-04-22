package com.veterinaria.veterinaria.factory;

import com.veterinaria.veterinaria.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.dominio.modelo.HistoriaClinica;
import org.springframework.stereotype.Component;

@Component
public class FactoryHistorioClinica {

    public HistoriaClinica crear(CommandHistoriaClinica commandHistoriaClinica) {
        return new HistoriaClinica(commandHistoriaClinica.getCodigoHistoria(),
                commandHistoriaClinica.getProcedimientos(), commandHistoriaClinica.getMedicamentos(),
                commandHistoriaClinica.getCodigoPaciente(), commandHistoriaClinica.getCodigoPropietario());
    }
}
