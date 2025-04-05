/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tienda.domain.RecepcionMercaderia;
import com.tienda.dao.RecepcionMercaderiaDao;
import com.tienda.service.RecepcionMercaderiaService;

@Service
public class RecepcionMercaderiaServiceImpl implements RecepcionMercaderiaService {

    @Autowired
    private RecepcionMercaderiaDao recepcionDao;

    @Override
    public List<RecepcionMercaderia> getRecepciones() {
        return recepcionDao.findAll();
    }

    @Override
    public void save(RecepcionMercaderia recepcion) {
        recepcionDao.save(recepcion);
    }

    @Override
    public RecepcionMercaderia findById(int id) {
        return recepcionDao.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        recepcionDao.deleteById(id);
    }
}