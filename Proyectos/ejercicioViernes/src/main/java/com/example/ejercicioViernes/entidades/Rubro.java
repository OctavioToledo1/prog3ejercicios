package com.example.ejercicioViernes.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Rubro extends BaseEntidad{
    private String denominacion;

    @OneToMany(orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "producto_rubro_id") //en pedidos existira una fk llamada pedido_id que apunta a rubro
    @Builder.Default
    private List<Producto> productos = new ArrayList<>();

    //METODO PARA AGREGAR PEDIDOS
    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public void mostrarRubro() {
        System.out.println("Denominacion: " + denominacion);
        for (Producto producto : productos) {
            System.out.println("Tipo: " + producto.getTipo() + ", Stock Actual: " + producto.getStockActual());
        }
    }

}
