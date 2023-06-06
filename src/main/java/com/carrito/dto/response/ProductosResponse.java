package com.carrito.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductosResponse {

    private int id;
    private String nombre;
    private String descripcion;
    private double valor;
    private int cantidad;

}
