package com.veterinaria.veterinaria.excepcion;

public class ExcepcionNombrePropietarioObligatorio extends RuntimeException
{
    public ExcepcionNombrePropietarioObligatorio(String mensaje) {
        super(mensaje);
    }
}
