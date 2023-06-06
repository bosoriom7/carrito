package com.carrito.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FacturasResponse {


    private int id;
    private double totalVenta;
    private int usuarioId;
    private int cantidadProductos;
}