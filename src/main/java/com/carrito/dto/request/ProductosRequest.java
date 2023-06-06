package com.carrito.dto.request;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import lombok.Data;

import java.util.Date;

@Data
public class ProductosRequest {
    private int ProductId=0;

    @NotNull
    @NotBlank(message = "Nombre es requerido")
    private String nombre;
    private String descripcion;
    private double valor;

    @Min(value = 1)
    @Max(value = 10)
    private int cantidad;
    private Date fechaCreacion;

}