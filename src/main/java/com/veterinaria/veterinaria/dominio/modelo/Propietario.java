package com.veterinaria.veterinaria.dominio.modelo;

import com.veterinaria.veterinaria.dominio.util.ValidadorArgumento;
import lombok.Getter;

@Getter 
public class Propietario {

    
	public static final String TELEFONO_PROPIETARIO_OBLIGATORIO = "EL TELEFONO DEL PROPIETARIO NO ´PUEDE ESTAR VACIO";
    public static final String NOMBRE_PRIPIETARIO_OBLIGATORIO = "EL NOMBRE DEL PROPIETARIO NO PUEDE ESTAR VACIO";

    private String nombre;
    private String apellido;
    private String id;
    private String telefono;
    private String direccion;
    private String Email;
    //Preferible utilizar Integer o Long en ves de Serialiazable
    private Paciente codigoPaciente;

	public Propietario(String nombre, String apellido, String id, String telefono, String direccion, String email,
			Paciente codigoPaciente) {

		ValidadorArgumento.validarNombrePropietarioNulo(nombre,NOMBRE_PRIPIETARIO_OBLIGATORIO);
		ValidadorArgumento.validarTelefonoNulo(telefono, TELEFONO_PROPIETARIO_OBLIGATORIO);
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.telefono = telefono;
		this.direccion = direccion;
		Email = email;
		this.codigoPaciente = codigoPaciente;
	}
    
    
}

