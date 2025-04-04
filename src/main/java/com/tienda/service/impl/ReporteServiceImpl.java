/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service.impl;

import com.tienda.dao.*;
import com.tienda.domain.*;
import com.tienda.service.ReporteService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReporteServiceImpl implements ReporteService {

    @Autowired
    private PedidoDao pedidoDao;

    @Autowired
    private DespachoMercaderiaDao despachoDao;

    @Autowired
    private RecepcionMercaderiaDao recepcionDao;

    @Override
    public List<Pedido> getPedidos() {
        return pedidoDao.findAll();
    }

    @Override
    public List<DespachoMercaderia> getDespachos() {
        return despachoDao.findAll();
    }

    @Override
    public List<RecepcionMercaderia> getRecepciones() {
        return recepcionDao.findAll();
    }
}
