package com.carrito.dto.request;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class UsuariosRequest {
    private int id = 0;

    @NotNull
    @NotBlank(message = "Nombre es requerido")
    private String nombre;
    @NotNull
    private String email;
    @NotNull
    private String contrasena;
    @NotNull
    private String rol;
    @NotNull
    private Date fechaCreacion;

}