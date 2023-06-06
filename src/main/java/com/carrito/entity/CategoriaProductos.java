package com.carrito.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
public class CategoriaProductos {
    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private Date fechaCreacion;
}
