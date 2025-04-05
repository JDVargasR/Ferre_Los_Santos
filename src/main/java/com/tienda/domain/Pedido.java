/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "FIDE_PEDIDO_TB")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_PEDIDO")
    private int idPedido;

    @Column(name = "FECHA_PEDIDO")
    private Date fechaPedido;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_FACTURA")
    private TipoFactura tipoFactura;

    @ManyToOne
    @JoinColumn(name = "ID_SEDE")
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_PEDIDO")
    private TipoPedido tipoPedido;

    @ManyToOne
    @JoinColumn(name = "ID_ESTADO")
    private Estado estado;

    public Pedido(int id) {
        this.idPedido = id;
    }

    public Pedido() {
        
    }
}
