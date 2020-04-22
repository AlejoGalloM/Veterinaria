package com.veterinaria.veterinaria.dominio.modelo;


import com.veterinaria.veterinaria.dominio.util.ValidadorArgumento;
import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
public class HistoriaClinica {

    public static final String MEDICAMENTOS_REQUERIDOS = "LOS MEDICAMENTOS APLICADOS O RESETADOS DEBEN SER ESPABLECIDOS";
    public static final String PROCEDIMIENTOS_REQUERIDOS = "LOS PROCEDIMIENTOS REALIZADOS DEBEN  SER ACLARADOS";

    //El codigo de historia antes era Serializable, como consejo, no utilizar Serializable para los id, mejor utilizar Integer o mucho mejor utilizar Long
    private Integer codigoHistoria;
    private String procedimientos;
    private String medicamentos;
    private Paciente codigoPaciente;
    private Propietario codigoPropietario;

    public HistoriaClinica(Integer codigoHistoria, String procedimientos, String medicamentos,
                           Paciente codigoPaciente, Propietario codigoPropietario) {

        ValidadorArgumento.validarMedicamentoNulo(medicamentos,MEDICAMENTOS_REQUERIDOS);
        ValidadorArgumento.validarProcedimientoNulo(procedimientos,PROCEDIMIENTOS_REQUERIDOS);
        this.codigoHistoria = codigoHistoria;
        this.procedimientos = procedimientos;
        this.medicamentos = medicamentos;
        this.codigoPaciente = codigoPaciente;
        this.codigoPropietario = codigoPropietario;
    }
}