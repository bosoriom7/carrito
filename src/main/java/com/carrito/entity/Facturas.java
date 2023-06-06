package com.carrito.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
public class Facturas {

    @Id
    @GeneratedValue
    private int id;
    private double totalVenta;
    private int usuarioId;
    private int cantidadProductos;
    private Date fechaCreacion;
}
