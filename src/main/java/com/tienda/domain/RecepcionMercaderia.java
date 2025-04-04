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
@Table(name = "FIDE_RECE_MERCADERIA_TB")
public class RecepcionMercaderia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_RECEPCION")
    private int idRecepcion;

    @Column(name = "FECHA_RECEPCION")
    private Date fechaRecepcion;

    @Column(name = "OBSERVACION")
    private String observacion;

    @ManyToOne
    @JoinColumn(name = "ID_ESTADO")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "ID_PEDIDO")
    private Pedido pedido;
}