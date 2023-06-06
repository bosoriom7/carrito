package com.carrito.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
public class Productos {

    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private String descripcion;
    private double valor;
    private int cantidad;
    private Date fechaCreacion;
}
