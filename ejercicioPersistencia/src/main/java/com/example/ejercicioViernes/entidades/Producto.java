package com.example.ejercicioViernes.entidades;

import com.example.ejercicioViernes.util.TipoProducto;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Producto extends BaseEntidad{

    private TipoProducto tipo; //manufacturado | insumo
    private Double precioVenta;
    private Double precioCompra;
    private String denominacion;
    private String unidadMedida;
    private String foto;
    private String receta;
    private int tiempoEstimadoCocina;
    private int stockActual;
    private int stockMinimo;
}
