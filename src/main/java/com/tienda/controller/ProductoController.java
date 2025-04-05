package com.tienda.controller;

import com.tienda.domain.Producto;
import com.tienda.service. *;
import com.tienda.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/producto")
public class ProductoController {

  @Autowired
    private ProductoService productoService;

    @Autowired
    private UnidadMedidaService unidadMedidaService;

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/registro_producto")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("producto", new Producto());
        model.addAttribute("unidades", unidadMedidaService.getUnidadMedida());
        model.addAttribute("estados", estadoService.getEstados());
        return "/registro_producto";
    }

    @PostMapping("/registro_producto")
    public String guardarProducto(@ModelAttribute Producto producto) {
        productoService.save(producto);
        return "redirect:/templates/registro_producto";
    }
}
