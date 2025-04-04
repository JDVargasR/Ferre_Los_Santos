/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/templates")
public class ReporteController {

    @Autowired
    private ReporteService reporteService;

    @GetMapping("/reportes")
    public String mostrarReportes(Model model) {
        model.addAttribute("pedidos", reporteService.getPedidos());
        model.addAttribute("despachos", reporteService.getDespachos());
        model.addAttribute("recepciones", reporteService.getRecepciones());
        return "/reportes";
    }
}