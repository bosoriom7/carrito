package com.carrito.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class DetalleFacturas {
    @Id
    @GeneratedValue
    private int id;
    private int productId;
    private int facturaId;
    private double valor;
    private int cantidad;
    private Date fechaCreacion;
}
