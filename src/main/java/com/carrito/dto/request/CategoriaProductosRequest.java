package com.carrito.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class CategoriaProductosRequest {

    private int id = 0;

    @NotNull
    @NotBlank
    private String nombre;
    @NotNull
    private Date fechaCreacion;
}