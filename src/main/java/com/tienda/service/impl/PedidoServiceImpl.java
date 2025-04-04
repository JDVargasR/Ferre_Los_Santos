
package com.tienda.service.impl;

import com.tienda.dao.PedidoDao;
import com.tienda.domain.Pedido;
import com.tienda.service.PedidoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoDao pedidoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pedido> getPedidos() {
        return pedidoDao.findAll();
    }

    @Override
    @Transactional
    public void save(Pedido pedido) {
        pedidoDao.save(pedido);
    }
}