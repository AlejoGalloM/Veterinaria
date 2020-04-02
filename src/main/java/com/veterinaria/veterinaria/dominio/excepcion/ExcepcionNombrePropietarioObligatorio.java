package com.veterinaria.veterinaria.dominio.excepcion;

public class ExcepcionNombrePropietarioObligatorio extends RuntimeException
{
    public ExcepcionNombrePropietarioObligatorio(String mensaje) {
        super(mensaje);
    }
}
