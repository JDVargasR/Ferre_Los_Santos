/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;


import java.util.List;
import com.tienda.domain.RecepcionMercaderia;

public interface RecepcionMercaderiaService {
    List<RecepcionMercaderia> getRecepciones();
    void save(RecepcionMercaderia recepcion);
    RecepcionMercaderia findById(int id);
    void deleteById(int id);
    
}
