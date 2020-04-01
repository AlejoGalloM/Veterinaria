package com.veterinaria.veterinaria.excepcion;

public class ExcepcionRazaPacienteObligatoria extends RuntimeException {
    public ExcepcionRazaPacienteObligatoria(String mensaje) {
        super(mensaje);
    }
}
