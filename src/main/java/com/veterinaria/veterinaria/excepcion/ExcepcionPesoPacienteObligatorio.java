package com.veterinaria.veterinaria.excepcion;

public class ExcepcionPesoPacienteObligatorio extends RuntimeException {
    public ExcepcionPesoPacienteObligatorio(String mensaje) {
        super(mensaje);
    }
}
