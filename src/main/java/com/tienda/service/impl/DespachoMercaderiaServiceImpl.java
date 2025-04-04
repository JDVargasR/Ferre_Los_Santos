/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service.impl;

import com.tienda.dao.DespachoMercaderiaDao;
import com.tienda.domain.DespachoMercaderia;
import com.tienda.service.DespachoMercaderiaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DespachoMercaderiaServiceImpl implements DespachoMercaderiaService {

    @Autowired
    private DespachoMercaderiaDao despachoDao;

    @Override
    @Transactional(readOnly = true)
    public List<DespachoMercaderia> getDespachos() {
        return despachoDao.findAll();
    }

    @Override
    @Transactional
    public void save(DespachoMercaderia despacho) {
        despachoDao.save(despacho);
    }
}