/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tienda.domain.TipoFactura;
import com.tienda.dao.TipoFacturaDao;
import com.tienda.service.TipoFacturaService;

@Service
public class TipoFacturaServiceImpl implements TipoFacturaService {

    @Autowired
    private TipoFacturaDao tipoFacturaDao;

    @Override
    public List<TipoFactura> getTiposFactura() {
        return tipoFacturaDao.findAll();
    }
}
