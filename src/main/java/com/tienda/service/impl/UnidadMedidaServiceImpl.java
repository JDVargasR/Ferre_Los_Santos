package com.tienda.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tienda.domain.UnidadMedida;
import com.tienda.dao.UnidadMedidaDao;
import com.tienda.service.UnidadMedidaService;

@Service
public class UnidadMedidaServiceImpl implements UnidadMedidaService {

    @Autowired
    private UnidadMedidaDao unidadMedidaDao;

    @Override
    public List<UnidadMedida> getUnidadMedida() {
        return unidadMedidaDao.findAll();
    }
}
