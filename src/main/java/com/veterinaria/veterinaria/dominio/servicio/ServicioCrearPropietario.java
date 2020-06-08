package com.veterinaria.veterinaria.dominio.servicio;


import com.veterinaria.veterinaria.dominio.excepcion.ExcepcionNombrePropietarioObligatorio;
import com.veterinaria.veterinaria.dominio.modelo.Propietario;
import com.veterinaria.veterinaria.dominio.repositoriopuerto.RepositorioPropietario;
import org.springframework.stereotype.Service;

@Service
public class ServicioCrearPropietario {

    private static final String NOMBRE_PROPIETARIO_OBLIGATORIO = "Es necesario ingresar la specie del paciente";
    private final RepositorioPropietario repositorioPropietario;

    public ServicioCrearPropietario(RepositorioPropietario repositorioPropietario) {
        this.repositorioPropietario = repositorioPropietario;
    }

    private void validarNombrePropietario(String nombre) {
        if (("").equals(nombre)) {
            throw new ExcepcionNombrePropietarioObligatorio(NOMBRE_PROPIETARIO_OBLIGATORIO);
        }
    }

    public void ejecutar(Propietario propietario) {
        validarNombrePropietario(propietario.getNombre());
        repositorioPropietario.guardar(propietario);
    }
}
