package com.veterinaria.veterinaria.dominio.excepcion;

public class ExcepcionEspeciePacienteObligatoria extends RuntimeException{
    public ExcepcionEspeciePacienteObligatoria(String mensaje) {
        super(mensaje);
    }
}
