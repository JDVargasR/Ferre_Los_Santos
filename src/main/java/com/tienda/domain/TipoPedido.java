/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name = "FIDE_TIPO_PEDIDO_TB")
public class TipoPedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_TIPO_PEDIDO")
    private int idTipoPedido;

    @Column(name = "NOMBRE_ESTADO")
    private String nombreEstado;
}