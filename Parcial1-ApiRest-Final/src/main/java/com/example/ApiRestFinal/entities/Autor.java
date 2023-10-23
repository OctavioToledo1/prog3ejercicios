package com.example.ApiRestFinal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "autor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Autor extends BaseEntidad{
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;
    @Column(name = "biografia", length = 1500) //indicamos que lo maximo es de 1500 caracteres
    private String biografia;



}
