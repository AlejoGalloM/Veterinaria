package com.veterinaria.veterinaria.dominio.excepcion;


public class ExcepcionPacienteObligatorio extends RuntimeException {
    public ExcepcionPacienteObligatorio(String mensaje) {
        super(mensaje);
    }
}
