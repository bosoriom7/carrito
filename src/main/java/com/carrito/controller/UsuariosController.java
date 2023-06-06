package com.carrito.controller;

import com.carrito.service.UsuariosServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {


    private final UsuariosServiceImpl usuariosServiceimpl;

    public UsuariosController(UsuariosServiceImpl usuariosServiceimpl) {
        this.usuariosServiceimpl = usuariosServiceimpl;
    }


    @GetMapping("/demo")
    public String showDemo(){
        return "Hola UsuariosController";
    }
}