/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tienda.domain.Sede;
import com.tienda.dao.SedeDao;
import com.tienda.service.SedeService;

@Service
public class SedeServiceImpl implements SedeService {

    @Autowired
    private SedeDao sedeDao;

    @Override
    public List<Sede> getSedes() {
        return sedeDao.findAll();
    }
}