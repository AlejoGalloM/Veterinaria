package com.veterinaria.veterinaria.entity;

import com.veterinaria.veterinaria.bussinesException.BussinesException;
import com.veterinaria.veterinaria.util.Validator;

import javax.validation.constraints.Email;
import java.io.Serializable;

public class Propietario {

    private static final String TELEFONO_PROPIETARIO_OBLIGATORIO = "EL TELEFONO DEL PROPIETARIO NO ´PUEDE ESTAR VACIO";
    private static final String NOMBRE_PRIPIETARIO_OBLIGATORIO = "EL NOMBRE DEL PROPIETARIO NO PUEDE ESTAR VACIO";
    private String nombre;
    private String apellido;
    private String id;
    private String telefono;
    private String direccion;
    private Email Email;
    private Serializable codigoPropietario;
    private Paciente codigoPaciente;

    private Propietario() {
        super();
    }

    public static class PropietarioBuilder {

        private String nombre;
        private String apellido;
        private String id;
        private String telefono;
        private String direccion;
        private Email Email;
        private Paciente codigoPaciente;
        private Serializable codigoPropietario;
        private static final long serialVersionUID = 8799656478674716638L;


        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public String getId() {
            return id;
        }

        public String getTelefono() {
            return telefono;
        }

        public String getDireccion() {
            return direccion;
        }

        public javax.validation.constraints.Email getEmail() {
            return Email;
        }

        public Paciente getCodigoPaciente() {
            return codigoPaciente;
        }

        public Serializable getCodigoPropietario() {
            return codigoPropietario;
        }

        public Propietario build() throws BussinesException {
            Propietario propietario = new Propietario();
            Validator.validarNombrePropietario(nombre, NOMBRE_PRIPIETARIO_OBLIGATORIO);
            propietario.nombre = this.nombre;
            propietario.apellido = this.apellido;
            propietario.id = this.id;
            Validator.validarTelefono(telefono, TELEFONO_PROPIETARIO_OBLIGATORIO);
            propietario.telefono = this.telefono;
            propietario.direccion = this.direccion;
            propietario.Email = this.Email;
            propietario.codigoPropietario = this.codigoPropietario;
            propietario.codigoPaciente = this.codigoPaciente;

            return propietario;
        }
    }
}

