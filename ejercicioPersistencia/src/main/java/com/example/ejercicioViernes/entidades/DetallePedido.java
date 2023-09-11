package com.example.ejercicioViernes.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
public class DetallePedido extends BaseEntidad {
    private int cantidad;
    private Double subtotal;

    // RELACION DOMICILIO - CLIENTE MANY TO ONE UNI
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "producto_detalle_id") //en pedidos existira una fk llamada pedido_id que apunta a usuario
    //@Builder.Default TIRA ERROR @BUILDER LINE 17
    private Producto producto;

    public void mostrarProducto(){

        System.out.println("Tipo: " + producto.getTipo() + ", Stock Actual: " + producto.getStockActual() + ", Stock Minimo: " + producto.getStockMinimo() + ", Precio Venta: " + producto.getPrecioVenta());

    }
}
