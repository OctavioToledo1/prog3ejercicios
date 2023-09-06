package com.example.ejercicioMuchoaBidi.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder

public class Domicilio extends BaseEntidad{

    private String calle;
    private int numero;



    @ManyToOne()
    @JoinColumn(name = "persona_id")
    private Persona persona;

}
