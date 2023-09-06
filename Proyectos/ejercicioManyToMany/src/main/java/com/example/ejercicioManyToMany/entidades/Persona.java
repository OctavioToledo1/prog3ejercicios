package com.example.ejercicioManyToMany.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Persona extends BaseEntidad{

    private String nombre;
    private String apellido;
    private int edad;

    @EqualsAndHashCode.Exclude //IMPORTAR ESTO PARA QUE NO HAYAN PROBLEMAS CON HASHMAP Y EQUALS


    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "persona_domicilio",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "domicilio_id")
    )
    @Builder.Default
    private Set<Domicilio> domicilios = new HashSet<>();


    public void agregarDomicilio(Domicilio domi){

        domicilios.add(domi);
    }


    public void mostrarDomicilios() {
        System.out.println("Domicilios de " + nombre + " " + apellido + ":");
        for (Domicilio domicilio : domicilios) {
            System.out.println("Calle: " + domicilio.getCalle() + ", Número: " + domicilio.getNumero());
        }


    }
}



