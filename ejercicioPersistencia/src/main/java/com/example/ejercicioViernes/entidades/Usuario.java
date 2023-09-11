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
public class Usuario extends BaseEntidad{
    private String nombre;
    private String password;
    private String rol;


    @OneToMany(orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "pedido_id_usuario") //en pedidos existira una fk llamada pedido_id que apunta a usuario
    @Builder.Default
    private List<Pedido> pedidosUsuario = new ArrayList<>();

    //METODO PARA AGREGAR PEDIDOS
    public void agregarPedidoUsuario(Pedido p){

        pedidosUsuario.add(p);
    }

    //METODO PARA MOSTRAR PEDIDOS
    public void mostrarPedidosUsuario() {
        System.out.println("Pedidos de " + nombre);
        for (Pedido pedido : pedidosUsuario) {
            System.out.println("Fecha: " + pedido.getFecha() + ", Total: " + pedido.getTotal());
        }

    }

}
