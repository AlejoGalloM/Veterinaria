package com.veterinaria.veterinaria.dominio.excepcion;

public class ExcepcionPacienteNoRegistrado extends RuntimeException {
    public ExcepcionPacienteNoRegistrado(String mensaje) {
        super(mensaje);
    }
}
