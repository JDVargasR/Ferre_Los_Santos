/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.DespachoMercaderia;
import java.util.List;

public interface DespachoMercaderiaService {
    List<DespachoMercaderia> getDespachos();
    void save(DespachoMercaderia despacho);
}
