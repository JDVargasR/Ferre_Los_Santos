/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.dao;

import com.tienda.domain.TipoFactura;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TipoFacturaDao extends JpaRepository<TipoFactura, Integer> {
    
}
