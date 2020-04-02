package com.veterinaria.veterinaria.dominio.excepcion;

public class ExcepcionProcedimientoObligatorio extends RuntimeException {

    public ExcepcionProcedimientoObligatorio(String mensaje) {
        super(mensaje);
    }
}
