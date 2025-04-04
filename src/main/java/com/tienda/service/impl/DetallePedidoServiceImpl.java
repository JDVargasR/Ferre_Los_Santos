/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service.impl;

import com.tienda.dao.DetallePedidoDao;
import com.tienda.domain.DetallePedido;
import com.tienda.service.DetallePedidoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DetallePedidoServiceImpl implements DetallePedidoService {

    @Autowired
    private DetallePedidoDao detalleDao;

    @Override
    @Transactional(readOnly = true)
    public List<DetallePedido> getDetalles() {
        return detalleDao.findAll();
    }

    @Override
    @Transactional
    public void save(DetallePedido detalle) {
        detalleDao.save(detalle);
    }
}