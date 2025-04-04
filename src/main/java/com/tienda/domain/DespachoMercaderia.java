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
@Table(name = "FIDE_DESPACHO_MERCA_TB")
public class DespachoMercaderia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_DESPACHO")
    private int idDespacho;

    @Column(name = "FECHA_DESPACHO")
    private Date fechaDespacho;

    @ManyToOne
    @JoinColumn(name = "ID_SEDE")
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "ID_PEDIDO")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "ID_ESTADO")
    private Estado estado;
}
