package com.veterinaria.veterinaria.argumento;


import com.veterinaria.veterinaria.dominio.excepcion.*;
import com.veterinaria.veterinaria.dominio.modelo.*;
import com.veterinaria.veterinaria.dominio.util.ValidadorArgumento;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class ValidadorArgumentoTest {

    public static final String MEDICAMENTOS_REQUERIDOS = "LOS MEDICAMENTOS APLICADOS O RESETADOS DEBEN SER ESPABLECIDOS";
    public static final String PROCEDIMIENTOS_REQUERIDOS = "LOS PROCEDIMIENTOS REALIZADOS DEBEN  SER ACLARADOS";
    public static final String ESPECIE_PACIENTE_REQUERIDA = "LA ESPECIE DEL PACIENTE NO PUEDE ESTAR VACIA";
    public static final String RAZA_PACIENTE_REQUERIDA = "LA RAZA DEL PACIENTE NO PUEDE ESTAR VACIA";
    public static final String PESO_PACIENTE_REQUERIDA = "EL PESO DEL PACIENTE NO PUEDE ESTAR VACIO";
    public static final String TELEFONO_PROPIETARIO_OBLIGATORIO = "EL TELEFONO DEL PROPIETARIO NO ´PUEDE ESTAR VACIO";
    public static final String NOMBRE_PRIPIETARIO_OBLIGATORIO = "EL NOMBRE DEL PROPIETARIO NO PUEDE ESTAR VACIO";

    @Test
    public void validarMedicamentoNoNuloTest() {
        try {
            ValidadorArgumento.validarMedicamentoNulo(null,
                    MEDICAMENTOS_REQUERIDOS);
            HistoriaClinica historiaClinica = new HistoriaClinicaTestDataBuilder()
                    .build();
            Assertions.fail();
        } catch (ExcepcionMedicamentoObligatorio e) {
            Assertions.assertEquals(MEDICAMENTOS_REQUERIDOS, e.getMessage());
        }
    }

    @Test
    public void validarProcedimientoNoNuloTest() {
        try {
            ValidadorArgumento.validarProcedimientoNulo(null,
                    PROCEDIMIENTOS_REQUERIDOS);
            HistoriaClinica historiaClinica = new HistoriaClinicaTestDataBuilder()
                    .build();
            Assertions.fail();
        } catch (ExcepcionProcedimientoObligatorio e) {
            Assertions.assertEquals(PROCEDIMIENTOS_REQUERIDOS, e.getMessage());
        }
    }

    @Test
    public void validarEspecieNoNulaTest() {
        try {
            ValidadorArgumento.validarEspecieNula(null,
                    ESPECIE_PACIENTE_REQUERIDA);
            Paciente paciente = new PacienteTestDataBuilder()
                    .build();
            Assertions.fail();
        } catch (ExcepcionEspeciePacienteObligatoria e) {
            Assertions.assertEquals(ESPECIE_PACIENTE_REQUERIDA, e.getMessage());
        }
    }

    @Test
    public void validarRazaNoNulaTest() {
        try {
            ValidadorArgumento.validarRazaNula(null,
                    RAZA_PACIENTE_REQUERIDA);
            Paciente paciente = new PacienteTestDataBuilder()
                    .build();
            Assertions.fail();
        } catch (ExcepcionRazaPacienteObligatoria e) {
            Assertions.assertEquals(RAZA_PACIENTE_REQUERIDA, e.getMessage());
        }
    }

    @Test
    public void validarPesoNoNulaTest() {
        try {
            ValidadorArgumento.validarPesoNulo(null,
                    PESO_PACIENTE_REQUERIDA);
            Paciente paciente = new PacienteTestDataBuilder()
                    .build();
            Assertions.fail();
        } catch (ExcepcionPesoPacienteObligatorio e) {
            Assertions.assertEquals(PESO_PACIENTE_REQUERIDA, e.getMessage());
        }
    }

    @Test
    public void validarNombrePropietarioNoNulaTest() {
        try {
            ValidadorArgumento.validarNombrePropietarioNulo(null,
                    NOMBRE_PRIPIETARIO_OBLIGATORIO);
            Propietario propietario = new PropietarioTestDataBuilder()
                    .build();
            Assertions.fail();
        } catch (ExcepcionNombrePropietarioObligatorio e) {
            Assertions.assertEquals(NOMBRE_PRIPIETARIO_OBLIGATORIO, e.getMessage());
        }
    }

    @Test
    public void validarTelefonoPropietarioNoNulaTest() {
        try {
            ValidadorArgumento.validarTelefonoNulo(null,
                    TELEFONO_PROPIETARIO_OBLIGATORIO);
            Propietario propietario = new PropietarioTestDataBuilder()
                    .build();
            Assertions.fail();
        } catch (ExcepcionTelefonoPropietarioObligatorio e) {
            Assertions.assertEquals(TELEFONO_PROPIETARIO_OBLIGATORIO, e.getMessage());
        }
    }
}
