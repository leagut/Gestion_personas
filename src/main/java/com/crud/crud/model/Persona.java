package com.crud.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Persona {
    @Column
    @Id
    private Long numDocumento;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String correo;

}
