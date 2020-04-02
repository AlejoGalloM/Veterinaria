package com.veterinaria.veterinaria.dominio.excepcion;

public class ExcepcionPesoPacienteObligatorio extends RuntimeException {
    public ExcepcionPesoPacienteObligatorio(String mensaje) {
        super(mensaje);
    }
}
