package com.example.ejercicioManyToMany.entidades;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Domicilio extends BaseEntidad {
    private String calle;
    private int numero;

    @ManyToMany(mappedBy = "domicilios")
    @Builder.Default
    private Set<Persona> personas = new HashSet<>();
}
