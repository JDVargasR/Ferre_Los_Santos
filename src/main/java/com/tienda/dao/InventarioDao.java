package com.tienda.dao;

import com.tienda.domain.Inventario;
import com.tienda.domain.Sede;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioDao extends JpaRepository <Inventario, Integer> {
    List<Inventario> findBySede(Sede sede);
}