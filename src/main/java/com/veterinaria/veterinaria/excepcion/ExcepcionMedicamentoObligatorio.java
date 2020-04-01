package com.veterinaria.veterinaria.excepcion;

public class ExcepcionMedicamentoObligatorio extends RuntimeException{


    public ExcepcionMedicamentoObligatorio(String mensaje) {
        super(mensaje);
    }
}
