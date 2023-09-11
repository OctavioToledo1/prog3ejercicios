package com.example.ejercicioViernes.entidades;

import com.example.ejercicioViernes.util.TipoEnvio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Pedido extends BaseEntidad{

    private String fecha;
    private String estado; //iniciado | preparacion | entregado
    private TipoEnvio tipoEnvio; // delivery | retira
    private String horaEstimadaEntregada;
    private double total;


    // RELACION PEDIDO - DETALLE.PEDIDO ONE TO MANY UNI
    @OneToMany(orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "detallePedido_id") //en pedidos existira una fk llamada pedido_id que apunta a usuario
    @Builder.Default
    private List<DetallePedido> detallePedidos = new ArrayList<>();

    // RELACION PEDIDO - FACTURA ONE TO ONE UNI
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "factura_id")
    private Factura factura;

    //METODO PARA AGREGAR PEDIDOS
    public void agregarDetallePedido(DetallePedido dp){

        detallePedidos.add(dp);
    }

    //METODO PARA MOSTRAR PEDIDOS
    public void mostrarDetallePedido() {
        System.out.println("Fecha: " + fecha + ", Hora estimada de entrega: " + horaEstimadaEntregada + ", Total: $ " + total);
        for (DetallePedido detallePedido : detallePedidos) {
            System.out.println("Cantidad: " + detallePedido.getCantidad() + ", SubTotal: $ " + detallePedido.getSubtotal());
        }
    }

    public void mostrarFactura(){
        System.out.println("Numero: " + factura.getNumero() + ", Forma de pago: " + factura.getFormaPago() + ", Total: " + factura.getTotal());
    }

}
