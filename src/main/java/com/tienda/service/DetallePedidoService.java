
package com.tienda.service;

import com.tienda.domain.DetallePedido;
import java.util.List;

public interface DetallePedidoService {
    List<DetallePedido> getDetalles();
    void save(DetallePedido detalle);
}