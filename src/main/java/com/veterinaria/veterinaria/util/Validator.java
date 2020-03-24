package com.veterinaria.veterinaria.util;

import com.veterinaria.veterinaria.bussinesException.BussinesException;

public class Validator {
    public static void validarEspecie(String especie, String mensaje) throws BussinesException {
        if(especie.isEmpty()){
            throw new BussinesException(mensaje);
        }
    }

    public static void validarRaza(String raza, String mensaje)throws BussinesException{
        if(raza.isEmpty()){
            throw new BussinesException(mensaje);
        }
    }

    public static void validarPeso(Integer peso,String mensaje) throws BussinesException{
        if("".equals(peso)){
            throw new BussinesException(mensaje);
        }
    }
    public static void validarProcedimientos(String procedimiento, String mensaje) throws BussinesException{
        if(procedimiento.isEmpty()){
            throw new BussinesException(mensaje);
        }
    }
    public static void validarMedicamentos(String medicamento, String mensaje) throws BussinesException{
        if(medicamento.isEmpty()){
            throw new BussinesException(mensaje);
        }
    }

    public static void validarNombrePropietario(String nombre,String mensaje) throws BussinesException{
        if(nombre.isEmpty()){
            throw new BussinesException(mensaje);
        }
    }

    public static void validarTelefono(String telefono, String mensaje) throws BussinesException{
        if(telefono.isEmpty()){
            throw new BussinesException(mensaje);
        }
    }

}
