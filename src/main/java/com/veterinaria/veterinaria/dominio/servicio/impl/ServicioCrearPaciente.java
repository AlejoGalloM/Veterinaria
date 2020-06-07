package com.veterinaria.veterinaria.dominio.servicio.impl;

import com.veterinaria.veterinaria.command.CommandPaciente;
import com.veterinaria.veterinaria.dominio.excepcion.ExcepcionEspeciePacienteObligatoria;
import com.veterinaria.veterinaria.dominio.excepcion.ExcepcionPacienteRegistrado;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPaciente;
import com.veterinaria.veterinaria.entidad.PacienteEntity;
import com.veterinaria.veterinaria.factory.FactoryPaciente;
import com.veterinaria.veterinaria.repositoriojpa.RepositorioPacienteJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCrearPaciente {

    private static final String ESPECIE_PACIENTE_OBLIGATORIO= "Es necesario ingresar la specie del paciente";
    private static final String PACIENTE_REGISTRADO = "El paciente indicado ya se encuentra registrado en el sistema";
    private static final String PACINETE_REGISTRADO_EXITOSAMENTE = "El paciente se ha registrado exitosamente";

    @Autowired
    public RepositorioPaciente repositorioPaciente;

    @Autowired
    public FactoryPaciente factoryPaciente;

    @Autowired
    public ServicioListarPaciente servicioListarPaciente;


    public String registrarPaciente(CommandPaciente commandPaciente) {
        validarPacienteCreado(commandPaciente);
        validarEspeciePaciente(commandPaciente.getEspecie());
        PacienteEntity pacienteEntity = new PacienteEntity();
        pacienteEntity.setCodigoPaciente(commandPaciente.getCodigoPaciente());
        pacienteEntity.setCodigoPropietario(commandPaciente.getPropietario());
        pacienteEntity.setEspecie(commandPaciente.getEspecie());
        pacienteEntity.setNombre(commandPaciente.getNombre());
        pacienteEntity.setPeso(commandPaciente.getPeso());
        pacienteEntity.setRaza(commandPaciente.getRaza());
        repositorioPaciente.save(pacienteEntity);
        return PACINETE_REGISTRADO_EXITOSAMENTE;
    }

    private void validarEspeciePaciente(String especie) {
        if(("").equals(especie)){
            throw new ExcepcionEspeciePacienteObligatoria(ESPECIE_PACIENTE_OBLIGATORIO);
        }
    }

    private void validarPacienteCreado(CommandPaciente commandPaciente) {

        List<CommandPaciente> listapacientes = servicioListarPaciente.findAll();
            for (CommandPaciente paciente:listapacientes) {
                if(commandPaciente.equals(paciente)) {
                    throw  new ExcepcionPacienteRegistrado(PACIENTE_REGISTRADO);
                }
        }

    }
}
