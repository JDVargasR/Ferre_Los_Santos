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
@Table(name = "FIDE_FACTURA_TB")
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_FACTURA")
    private int idFactura;

    @Column(name = "FECHA_FACTURA")
    private Date fechaFactura;

    @ManyToOne
    @JoinColumn(name = "ID_PEDIDO")
    private Pedido pedido;

    @Column(name = "IMPUESTO")
    private int impuesto;

    @Column(name = "DESCUENTO")
    private int descuento;

    @Column(name = "TOTAL_FACTURA")
    private int totalFactura;

    @ManyToOne
    @JoinColumn(name = "ID_ESTADO")
    private Estado estado;
}
