package com.example.ejerciciobidiUno.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Domicilio extends BaseEntidad {



    private String calle;
    private int numero;

    @OneToOne(mappedBy = "domicilio")

    private Persona persona;
}
