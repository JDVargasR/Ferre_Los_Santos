package com.tienda.controller;

import com.tienda.domain.Sede;
import com.tienda.service. *;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/templates")
public class ConsultaInventarioController {

    @Autowired
    private InventarioService inventarioService;

    @Autowired
    private SedeService sedeService;

    @GetMapping("/consulta_inventario")
    public String mostrarFormularioConsulta(Model model) {
        model.addAttribute("sedes", sedeService.getSedes());
        return "/consulta_inventario";
    }

    @PostMapping("/consulta_inventario")
    public String consultarInventario(@RequestParam("idSede") int idSede, Model model) {
        Sede sede = new Sede(idSede);
        var inventario = inventarioService.getInventarioPorSede(sede);
        model.addAttribute("inventario", inventario);
        model.addAttribute("sedes", sedeService.getSedes());
        return "/consulta_inventario";
    }
}