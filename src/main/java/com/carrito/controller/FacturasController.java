package com.carrito.controller;

import com.carrito.service.FacturasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facturas")
public class FacturasController {

    private final FacturasService facturasService;

    public FacturasController(FacturasService facturasService) {
        this.facturasService = facturasService;
    }

    @GetMapping("/demo")
    public String showDemo(){
        return "Hola FacturasController";
    }
}
