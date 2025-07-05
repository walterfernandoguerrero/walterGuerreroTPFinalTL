package com.example.walterGuerrero_Pfinal_TLab.controller;

import com.example.walterGuerrero_Pfinal_TLab.model.Producto;
import com.example.walterGuerrero_Pfinal_TLab.service.ProductoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
@CrossOrigin("*")
public class productoController {

    //variable desde el servicio
    private ProductoService ps;

    @GetMapping("/list")
    public List<Producto> listarProductos() {
        return ps.listarProductos();
    }
}
