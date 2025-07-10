package com.example.walterGuerrero_Pfinal_TLab.controller;

import com.example.walterGuerrero_Pfinal_TLab.model.Producto;
import com.example.walterGuerrero_Pfinal_TLab.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
@CrossOrigin("*")
public class productoController {

    //variable desde el servicio
    @Autowired
    ProductoService ps;

    @GetMapping("/list")
    public List<Producto> listarProductos() {
        return ps.listarProductos();
    }

    @PostMapping("/nuevoProducto")
    public String crearProducto(@RequestBody Producto prod){
        return ps.crearProducto(prod);
    }
    //crear Varios Productos
    @PostMapping("/batch")
    public List<Producto>crearProductos(@RequestBody List<Producto> productos){
        return ps.crearProductos(productos);
    }



    //prueba de modificar
    @PutMapping("/edit/{id}")
    public String editarProducto(@PathVariable Long id, @RequestBody Producto prod){
        return ps.editarProducto(id,prod);
    }

    @GetMapping("/buscar/{id}")
    public Producto buscarProducto(@PathVariable Long id) {
        return ps.buscarPorId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        return ps.eliminarProducto(id);
    }

}
