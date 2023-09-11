package com.example.ejercicioViernes.entidades;

import com.example.ejercicioViernes.util.FormaPago;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Factura extends BaseEntidad{
    private Date fecha;
    private int numero;
    private Double descuento;
    private FormaPago formaPago; // efectivo | etc
    private int total;


}
