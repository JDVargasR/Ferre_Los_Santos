
package com.tienda.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name = "FIDE_DETALLE_PEDIDO_TB")
public class DetallePedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_DETALLE_PEDIDO")
    private int idDetallePedido;

    @Column(name = "CANTIDAD_SOLICITADA")
    private int cantidadSolicitada;

    @Column(name = "CANTIDAD_RECIBIDA")
    private int cantidadRecibida;

    @ManyToOne
    @JoinColumn(name = "ID_PEDIDO")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "ID_ESTADO")
    private Estado estado;
}