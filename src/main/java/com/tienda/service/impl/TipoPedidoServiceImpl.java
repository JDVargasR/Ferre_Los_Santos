/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tienda.domain.TipoPedido;
import com.tienda.dao.TipoPedidoDao;
import com.tienda.service.TipoPedidoService;

public class TipoPedidoServiceImpl implements TipoPedidoService {

    @Autowired
    private TipoPedidoDao tipoPedidoDao;

    @Override
    public List<TipoPedido> getTiposPedido() {
        return tipoPedidoDao.findAll();
    }

}
