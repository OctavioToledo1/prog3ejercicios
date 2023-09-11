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
public class Cliente extends BaseEntidad {
   private String nombre;
   private String apellido;
   private String telefono;
    private String email;


    // RELACION CLIENTE - PEDIDO ONE TO MANY UNI
    @OneToMany(orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "pedido_id_cliente") //en pedidos existira una fk llamada pedido_id que apunta a usuario
    @Builder.Default
    private List<Pedido> pedidosCliente = new ArrayList<>();


    //METODO PARA AGREGAR PEDIDOS
    public void agregarPedidoCliente(Pedido p){

        pedidosCliente.add(p);
    }

    //METODO PARA MOSTRAR PEDIDOS
    public void mostrarPedidosCliente() {
        System.out.println("Pedidos de " + nombre + " " + apellido);
        for (Pedido pedido : pedidosCliente) {
            System.out.println("Fecha: " + pedido.getFecha() + ", Total: " + pedido.getTotal());
        }
    }


}
