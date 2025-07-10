package com.example.walterGuerrero_Pfinal_TLab.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fecha;
    private String cliente;
    private int producto;
    private int precio;
    private int cantidad;
    private Long nropedido;
//-----
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getNombreCliente() {
        return cliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.cliente = nombreCliente;
    }
    public int getProducto() {
        return producto;
    }
    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Long getNropedido() {
        return nropedido;
    }

    public void setNropedido(Long nropedido) {
        this.nropedido = nropedido;
    }
}
