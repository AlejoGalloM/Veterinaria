package com.veterinaria.veterinaria.dominio.excepcion;

public class ExcepcionMedicamentoObligatorio extends RuntimeException{


    public ExcepcionMedicamentoObligatorio(String mensaje) {
        super(mensaje);
    }
}
