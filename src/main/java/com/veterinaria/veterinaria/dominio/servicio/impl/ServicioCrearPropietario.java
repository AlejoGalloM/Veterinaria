package com.veterinaria.veterinaria.dominio.servicio.impl;

import com.veterinaria.veterinaria.command.CommandPaciente;
import com.veterinaria.veterinaria.command.CommandPropietario;
import com.veterinaria.veterinaria.dominio.excepcion.ExcepcionEspeciePacienteObligatoria;
import com.veterinaria.veterinaria.dominio.excepcion.ExcepcionNombrePropietarioObligatorio;
import com.veterinaria.veterinaria.dominio.excepcion.ExcepcionPacienteRegistrado;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPropietario;
import com.veterinaria.veterinaria.entidad.PropietarioEntity;
import com.veterinaria.veterinaria.factory.FactoryPropietario;
import com.veterinaria.veterinaria.repositoriojpa.RepositorioPropietarioJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCrearPropietario {

    private static final String PROPIETARIO_REGISTRADO = "El paciente indicado ya se encuentra registrado en el sistema";
    private static final String PROPIETARIO_REGISTRADO_EXITOSAMENTE = "El paciente se ha registrado exitosamente";
    private static final String NOMBRE_PROPIETARIO_OBLIGATORIO= "Es necesario ingresar la specie del paciente";

    @Autowired
    public RepositorioPropietarioJpa repositorioPropietarioJpa;

    @Autowired
    public FactoryPropietario factoryPropietario;

    @Autowired
    public ServicioListarPropietario servicioListarPropietario;

    public String registrarPropietario(CommandPropietario commandPropietario){
        validarPropietarioCreado(commandPropietario);
        validarNombrePropietario(commandPropietario.getNombre());
        PropietarioEntity propietarioEntity= new PropietarioEntity();
        propietarioEntity.setNombre(commandPropietario.getNombre());
        propietarioEntity.setApellido(commandPropietario.getApellido());
        propietarioEntity.setId(commandPropietario.getId());
        propietarioEntity.setTelefono(commandPropietario.getTelefono());
        propietarioEntity.setDireccion(commandPropietario.getDireccion());
        propietarioEntity.setEmail(commandPropietario.getEmail());
        repositorioPropietarioJpa.save(propietarioEntity);
        return PROPIETARIO_REGISTRADO_EXITOSAMENTE;
    }

    private void validarNombrePropietario(String nombre) {
        if(("").equals(nombre)){
            throw new ExcepcionNombrePropietarioObligatorio(NOMBRE_PROPIETARIO_OBLIGATORIO);
        }
    }
    private void validarPropietarioCreado(CommandPropietario commandPropietario){
        List<CommandPropietario> listapropietarios = servicioListarPropietario.findAll();
        for (CommandPropietario propietario:listapropietarios) {
            if(commandPropietario.equals(propietario)) {
                throw  new ExcepcionPacienteRegistrado(PROPIETARIO_REGISTRADO);
            }
        }

    }

}
