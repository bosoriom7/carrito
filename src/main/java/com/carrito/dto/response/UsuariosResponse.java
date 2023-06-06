package com.carrito.dto.response;
import jakarta.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
@Entity
public class UsuariosResponse {

    @Id
    private int id;

    @NotNull
    @NotBlank(message = "Nombre es requerido")
    private String nombre;
    @NotNull
    private String email;
    @NotNull
    private String rol;
}
