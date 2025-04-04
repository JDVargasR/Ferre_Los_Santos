package com.tienda.service.impl;

import com.tienda.dao.InventarioDao;
import com.tienda.domain.Inventario;
import com.tienda.domain.Sede;
import com.tienda.service.InventarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InventarioServiceImpl implements InventarioService {

    @Autowired
    private InventarioDao inventarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Inventario> getInventarioPorSede(Sede sede) {
        return inventarioDao.findBySede(sede);
    }
}