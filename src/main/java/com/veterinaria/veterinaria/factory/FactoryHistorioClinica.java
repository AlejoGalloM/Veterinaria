package com.veterinaria.veterinaria.factory;

import com.veterinaria.veterinaria.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.dominio.modelo.HistoriaClinica;
import com.veterinaria.veterinaria.entidad.HistoriaClinicaEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FactoryHistorioClinica {



    public List<CommandHistoriaClinica> entityToCommand(List<HistoriaClinicaEntity> listaHistoriaClinicaEntity) {
        List<CommandHistoriaClinica> listaCommandHistoriaClinica = new ArrayList<>();
        for(HistoriaClinicaEntity historiaClinicaEntity: listaHistoriaClinicaEntity){
            listaCommandHistoriaClinica.add(entityToCommand(historiaClinicaEntity));
        }
        return listaCommandHistoriaClinica;
    }

    private CommandHistoriaClinica entityToCommand(HistoriaClinicaEntity historiaClinicaEntity) {
        CommandHistoriaClinica commandHistoriaClinica = new CommandHistoriaClinica();
        commandHistoriaClinica.setCodigoHistoria(historiaClinicaEntity.getCodigoHistoria());
        commandHistoriaClinica.setCodigoPaciente(historiaClinicaEntity.getCodigoPaciente());
        commandHistoriaClinica.setCodigoPropietario(historiaClinicaEntity.getCodigoPropietario());
        commandHistoriaClinica.setMedicamentos(historiaClinicaEntity.getMedicamentos());
        commandHistoriaClinica.setProcedimientos(historiaClinicaEntity.getProcedimientos());

        return commandHistoriaClinica;
    }
}
