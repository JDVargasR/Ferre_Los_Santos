/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Pedido;
import java.util.List;

public interface PedidoService {
    List<Pedido> getPedidos();
    void save(Pedido pedido);
}
