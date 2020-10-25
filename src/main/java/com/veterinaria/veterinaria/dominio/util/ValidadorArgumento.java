package com.veterinaria.veterinaria.dominio.util;


import com.veterinaria.veterinaria.dominio.excepcion.*;

public class ValidadorArgumento {
    public static void validarEspecieNula(String especie, String mensaje) {
        if (especie == null) {
            throw new ExcepcionEspeciePacienteObligatoria(mensaje);
        }
    }

    public static void validarRazaNula(String raza, String mensaje) {
        if (raza == null) {
            throw new ExcepcionRazaPacienteObligatoria(mensaje);
        }
    }
    //preferible utilizar este metodo con el Object, este no importa si es un String o un Integer
    public static void validadorArgumento(Object valor, String mensaje){
        if( valor == null ){
            throw new ExcepcionPesoPacienteObligatorio(mensaje);
        }
    }

    //Preferible utilizar int en ves De Integer
    public static void validarPesoNulo(Integer peso, String mensaje) {
        if (peso == null) {
            throw new ExcepcionPesoPacienteObligatorio(mensaje);
        }
    }

    public static void validarProcedimientoNulo(String procedimiento, String mensaje) {
        if (procedimiento == null) {
            throw new ExcepcionProcedimientoObligatorio(mensaje);
        }
    }

    public static void validarMedicamentoNulo(String medicamento, String mensaje) {
        if (medicamento == null) {
            throw new ExcepcionMedicamentoObligatorio(mensaje);
        }
    }

    public static void validarNombrePropietarioNulo(String nombre, String mensaje) {
        if (nombre == null) {
            throw new ExcepcionNombrePropietarioObligatorio(mensaje);
        }
    }

    public static void validarTelefonoNulo(String telefono, String mensaje) {
        if (telefono == null) {
            throw new ExcepcionTelefonoPropietarioObligatorio(mensaje);
        }
    }

}
