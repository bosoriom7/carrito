package com.carrito.dto.request;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class DetalleFacturasRequest {

    private int id = 0;

    @NotNull
    @NotBlank(message = "Nombre es requerido")
    private int productId;
    private int facturaId;
    private double valor;
    private int cantidad;
    private Date fechaCreacion;
}