package com.carrito.dto.request;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class FacturasRequest {

    private int id = 0;
    @NotNull
    private double totalVenta;
    @NotNull
    private int usuarioId;
    @Min(value = 1)
    @Max(value = 10)
    private int cantidadProductos;
    private Date fechaCreacion;

}