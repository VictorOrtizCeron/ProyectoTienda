package com.tienda.Tienda.controller;

import com.tienda.Tienda.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
@RequestMapping("/reportes")
public class ReporteController {
    @Autowired
    ReporteService reporteService;

    @GetMapping("/principal")
    public String principal(Model model){
        return "/reportes/principal"; 
    }
    @GetMapping("/usuarios")
    public ResponseEntity<Resource> usuarios(@RequestParam String tipo) throws IOException {

        return reporteService.generaReporte("usuarios", null, tipo);
    }

    @GetMapping("/ventas")
    public ResponseEntity<Resource> ventas(@RequestParam String tipo) throws IOException {

        return reporteService.generaReporte("ventas", null, tipo);
    }

    @GetMapping("/CategoriasProductos")
    public ResponseEntity<Resource> CateogriasProductos(@RequestParam String tipo) throws IOException {

        return reporteService.generaReporte("CategoriasProductos", null, tipo);
    }
    @GetMapping("/VentaProducto")
    public ResponseEntity<Resource> VentaProdcto(@RequestParam String tipo) throws IOException {

        return reporteService.generaReporte("VentaProducto", null, tipo);
    }
}
