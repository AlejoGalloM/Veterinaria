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


        public PropietarioBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public PropietarioBuilder setApellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public PropietarioBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public PropietarioBuilder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public PropietarioBuilder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public PropietarioBuilder setEmail(javax.validation.constraints.Email email) {
            Email = email;
            return this;
        }

        public PropietarioBuilder setCodigoPaciente(Paciente codigoPaciente) {
            this.codigoPaciente = codigoPaciente;
            return this;
        }

        public PropietarioBuilder setCodigoPropietario(Serializable codigoPropietario) {
            this.codigoPropietario = codigoPropietario;
            return this;
        }

        public Propietario build() throws BussinesException {
            Propietario propietario = new Propietario();
            Validator.validarNombrePropietario(nombre,NOMBRE_PRIPIETARIO_OBLIGATORIO );
            propietario.nombre = this.nombre;
            propietario.apellido = this.apellido;
            propietario.id = this.id;
            Validator.validarTelefono(telefono,TELEFONO_PROPIETARIO_OBLIGATORIO);
            propietario.telefono = this.telefono;
            propietario.direccion = this.direccion;
            propietario.Email = this.Email;
            propietario.codigoPropietario = this.codigoPropietario;
            propietario.codigoPaciente = this.codigoPaciente;

            return propietario;
        }
    }
}

