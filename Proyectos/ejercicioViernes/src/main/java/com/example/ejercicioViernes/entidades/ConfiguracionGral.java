package com.example.ejercicioViernes.entidades;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.StringTokenizer;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class ConfiguracionGral extends BaseEntidad{

    private int cantidadCocineros;
    private String emailEmpresa;
    private String tokenMercadoPago;

}
