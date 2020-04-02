package com.veterinaria.veterinaria.dominio.excepcion;

public class ExcepcionRazaPacienteObligatoria extends RuntimeException {
    public ExcepcionRazaPacienteObligatoria(String mensaje) {
        super(mensaje);
    }
}
