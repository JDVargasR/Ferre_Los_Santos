/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class DespachoController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private SedeService sedeService;

    @Autowired
    private EstadoService estadoService;

    @Autowired
    private DespachoMercaderiaService despachoService;

    @GetMapping("/despacho_pedidos")
    public String mostrarFormularioDespacho(Model model) {
        model.addAttribute("pedidos", pedidoService.getPedidos());
        model.addAttribute("sedes", sedeService.getSedes());
        return "/despacho_pedidos";
    }

    @PostMapping("/despacho_pedidos")
    public String despachar(@RequestParam("idPedido") int idPedido,
                            @RequestParam("idSede") int idSede) {

        DespachoMercaderia despacho = new DespachoMercaderia();
        despacho.setFechaDespacho(new Date());
        despacho.setPedido(new Pedido(idPedido));
        despacho.setSede(new Sede(idSede));
        despacho.setEstado(new Estado(1)); // Activo por defecto

        despachoService.save(despacho);

        return "redirect:/templates/despacho_pedidos";
    }
}