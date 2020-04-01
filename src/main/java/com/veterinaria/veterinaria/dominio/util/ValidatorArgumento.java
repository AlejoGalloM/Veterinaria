package com.veterinaria.veterinaria.dominio.util;


import com.veterinaria.veterinaria.excepcion.*;

public class ValidatorArgumento {
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
