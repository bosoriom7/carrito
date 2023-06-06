package com.carrito.controller;

import com.carrito.service.DetalleFacturasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detalle-facturas")
public class DetalleFacturasController {

    private final DetalleFacturasService detalleFacturasService;

    public DetalleFacturasController(DetalleFacturasService detalleFacturasService) {
        this.detalleFacturasService = detalleFacturasService;
    }

    @GetMapping("/demo")
    public String showDemo(){
        return "Hola DetalleFacturasController";
    }
}
