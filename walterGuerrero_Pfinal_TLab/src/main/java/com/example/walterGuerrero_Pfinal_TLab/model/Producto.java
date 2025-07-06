package com.example.walterGuerrero_Pfinal_TLab.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombre;
    private String descripcion;
    private String url_imagen;
    private int precio;
    private int categoria;
    private int stock;

    // Constructor por defecto (¡añadido para solucionar el error!)
    public Producto() {
    }
    
}
