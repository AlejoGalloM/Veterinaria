package com.veterinaria.veterinaria.dominio.servicio;

import com.veterinaria.veterinaria.aplicacion.command.CommandHistoriaClinica;
import com.veterinaria.veterinaria.aplicacion.command.CommandPaciente;
import com.veterinaria.veterinaria.aplicacion.command.CommandPropietario;
import com.veterinaria.veterinaria.aplicacion.factory.FactoryHistorioClinica;
import com.veterinaria.veterinaria.aplicacion.factory.FactoryPaciente;
import com.veterinaria.veterinaria.aplicacion.factory.FactoryPropietario;
import com.veterinaria.veterinaria.dominio.excepcion.ExcepcionNombrePropietarioObligatorio;
import com.veterinaria.veterinaria.dominio.excepcion.ExcepcionPacienteNoRegistrado;
import com.veterinaria.veterinaria.dominio.excepcion.ExcepcionPropietarioNoRegistrado;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioHistoriaClinica;
import com.veterinaria.veterinaria.infraestructura.entidad.HistoriaClinicaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCrearHistoriaClinica {

    private static final String IDENTIFICACION_PACIENTE_OBLIGATORIA = "La identificación del paciente es obligatoria";
    private static final String PROPIETARIO_NO_REGISTRADO = "El propietario ingresado no se encuentra registrado en el sistema";
    private static final String PACIENTE_NO_REGISTRADO = "El paciente ingresado no se encuentra registrado en el  se";
    private static final String HISTORIA_CLINICA_CREADA_EXITOSAMENTE = "La historia Clinica ha sido creada con éxito ";
    private CommandPropietario propietario;
    private CommandPaciente paciente;
    @Autowired
    RepositorioHistoriaClinica repositorioHistoriaClinica;

    @Autowired
    FactoryHistorioClinica factoryHistorioClinica;

    @Autowired
    FactoryPropietario factoryPropietario;

    @Autowired
    ServicioListarPropietario servicioListarPropietario;

    @Autowired
    ServicioListarPaciente servicioListarPaciente;

    @Autowired
    FactoryPaciente factoryPaciente;

    public String registrarHistoriaClinica(CommandHistoriaClinica commandHistoriaClinica) {
        validarPropietarioNoNulo(commandHistoriaClinica.getCodigoPropietario());
        validarPropietarioNoRegistrado(commandHistoriaClinica.getCodigoPropietario());
        validarPacinteNoRegistrado(commandHistoriaClinica.getCodigoPaciente());
        HistoriaClinicaEntity historiaClinicaEntity = new HistoriaClinicaEntity();
        historiaClinicaEntity.setCodigoHistoria(commandHistoriaClinica.getCodigoHistoria());
        historiaClinicaEntity.setCodigoPropietario(commandHistoriaClinica.getCodigoPropietario());
        historiaClinicaEntity.setCodigoPaciente(commandHistoriaClinica.getCodigoPaciente());
        historiaClinicaEntity.setMedicamentos(commandHistoriaClinica.getMedicamentos());
        historiaClinicaEntity.setProcedimientos(commandHistoriaClinica.getProcedimientos());
        repositorioHistoriaClinica.save(historiaClinicaEntity);
        return HISTORIA_CLINICA_CREADA_EXITOSAMENTE;

    }

    private void validarPacinteNoRegistrado(Integer codigoPaciente) {
        List<CommandPaciente> listaPacientes = servicioListarPaciente.findAll();
        boolean registrado = false;
        for (CommandPaciente paciente : listaPacientes) {
            if (paciente.getCodigoPaciente().equals(codigoPaciente)) {
                registrado = true;
                agregarPaciente(paciente);
                break;
            }

        }
        if (!registrado) {

            throw new ExcepcionPacienteNoRegistrado(PACIENTE_NO_REGISTRADO);
        }
    }

    private void agregarPaciente(CommandPaciente paciente) {
        this.paciente = paciente;
    }

    private void validarPropietarioNoRegistrado(Integer codigoPropietario) {
        List<CommandPropietario> listaPropietarios = servicioListarPropietario.findAll();
        boolean encontrado = false;
        for (CommandPropietario propietario : listaPropietarios) {
            if (codigoPropietario.equals(propietario.getId())) {
                encontrado = true;
                this.propietario = propietario;
                break;
            }
        }
        if (!encontrado) {
            throw new ExcepcionPropietarioNoRegistrado(PROPIETARIO_NO_REGISTRADO);
        }
    }

    private void validarPropietarioNoNulo(Integer codigoPropietario) {
        if (codigoPropietario == null) {
            throw new ExcepcionNombrePropietarioObligatorio(IDENTIFICACION_PACIENTE_OBLIGATORIA);
        }
    }
}
