package com.veterinaria.veterinaria.excepcion;

public class ExcepcionEspeciePacienteObligatoria extends RuntimeException{
    public ExcepcionEspeciePacienteObligatoria(String mensaje) {
        super(mensaje);
    }
}
