package com.carrito.controller;

import com.carrito.service.CategoriaProductosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria-productos")
public class CategoriaProductosController {
    private final CategoriaProductosService categoriaProductosService;

    public CategoriaProductosController(CategoriaProductosService categoriaProductosService) {
        this.categoriaProductosService = categoriaProductosService;
    }
    @GetMapping("/demo")
    public String showDemo(){
        return "Hola CategoriaProductosController";
    }
}