package com.veterinaria.veterinaria.excepcion;

public class ExcepcionProcedimientoObligatorio extends RuntimeException {

    public ExcepcionProcedimientoObligatorio(String mensaje) {
        super(mensaje);
    }
}
