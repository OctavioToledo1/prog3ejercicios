package com.example.ApiRestFinal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "domicilio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Domicilio extends BaseEntidad {

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private int numero;

    @ManyToOne(optional = false) //la localidad no puede ser nula al crear un domicilio
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;



}
