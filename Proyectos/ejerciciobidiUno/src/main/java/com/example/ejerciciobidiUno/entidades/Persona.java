package com.example.ejerciciobidiUno.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "persona")


public class Persona extends BaseEntidad{


    @Column(name = "persona")
    private String nombre;
    private String apellido;

    private int edad;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "domicilio_id")

    private Domicilio domicilio;

}
