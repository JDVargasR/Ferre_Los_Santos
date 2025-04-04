/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.*;

import java.util.List;

public interface ReporteService {
    List<Pedido> getPedidos();
    List<DespachoMercaderia> getDespachos();
    List<RecepcionMercaderia> getRecepciones();
}