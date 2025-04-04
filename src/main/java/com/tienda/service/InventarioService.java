package com.tienda.service;

import com.tienda.domain.Inventario;
import com.tienda.domain.Sede;
import java.util.List;

public interface InventarioService {
    List<Inventario> getInventarioPorSede(Sede sede);
}