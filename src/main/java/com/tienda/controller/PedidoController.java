package com.tienda.controller;

import com.tienda.domain.*;
import com.tienda.service.*;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/templates")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private DetallePedidoService detallePedidoService;

    @Autowired
    private ProductoService productoService;

    @Autowired
    private SedeService sedeService;

    @Autowired
    private TipoFacturaService tipoFacturaService;

    @Autowired
    private TipoPedidoService tipoPedidoService;

    @GetMapping("/realizar_pedido")
    public String mostrarFormulario(Model model) {
        model.addAttribute("productos", productoService.getProductos());
        model.addAttribute("sedes", sedeService.getSedes());
        model.addAttribute("tiposFactura", tipoFacturaService.getTiposFactura());
        model.addAttribute("tiposPedido", tipoPedidoService.getTiposPedido());
        return "/realizar_pedido";
    }

    @PostMapping("/realizar_pedido")
    public String guardarPedido(@RequestParam("idProducto") int idProducto,
                                 @RequestParam("cantidad") int cantidad,
                                 @RequestParam("idSede") int idSede,
                                 @RequestParam("idTipoFactura") int idTipoFactura,
                                 @RequestParam("idTipoPedido") int idTipoPedido) {

        Pedido pedido = new Pedido();
        pedido.setFechaPedido(new Date());
        pedido.setSede(new Sede(idSede));
        pedido.setTipoFactura(new TipoFactura(idTipoFactura));
        pedido.setTipoPedido(new TipoPedido(idTipoPedido));
        pedido.setEstado(new Estado(1)); // Activo por defecto
        pedidoService.save(pedido);

        DetallePedido detalle = new DetallePedido();
        detalle.setCantidadSolicitada(cantidad);
        detalle.setCantidadRecibida(0);
        detalle.setPedido(pedido);
        detalle.setProducto(new Producto(idProducto));
        detalle.setEstado(new Estado(1)); // Activo
        detallePedidoService.save(detalle);

        return "redirect:/templates/realizar_pedido";
    }
}