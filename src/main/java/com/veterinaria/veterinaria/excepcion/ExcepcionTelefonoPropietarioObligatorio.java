package com.veterinaria.veterinaria.excepcion;

public class ExcepcionTelefonoPropietarioObligatorio extends RuntimeException {
    public ExcepcionTelefonoPropietarioObligatorio(String mensaje) {
        super(mensaje);
    }
}
