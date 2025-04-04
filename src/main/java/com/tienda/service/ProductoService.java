package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {

    List<Producto> getProductos();

    void save(Producto producto);

    void delete(Producto producto);

    Producto getProducto(Producto producto);
}
