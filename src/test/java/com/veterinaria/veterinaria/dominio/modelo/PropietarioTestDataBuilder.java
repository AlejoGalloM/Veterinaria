package com.veterinaria.veterinaria.dominio.modelo;

import lombok.Setter;

@Setter
public class PropietarioTestDataBuilder implements IPropietario {
    private String nombre;
    private String apellido;
    private String id;
    private String telefono;
    private String direccion;
    private String Email;

@Override
    public Propietario build() {
        return new Propietario(this.nombre, this.apellido, this.id, this.telefono,
                this.direccion, this.Email);
    }
}
