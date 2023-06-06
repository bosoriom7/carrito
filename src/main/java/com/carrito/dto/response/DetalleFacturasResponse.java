package com.carrito.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DetalleFacturasResponse {
    private int id;
    private int productId;
    private int facturaId;
    private double valor;
    private int cantidad;
}
