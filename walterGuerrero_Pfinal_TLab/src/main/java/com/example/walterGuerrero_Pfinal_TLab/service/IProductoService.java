package com.example.walterGuerrero_Pfinal_TLab.service;

import com.example.walterGuerrero_Pfinal_TLab.model.Producto;
import java.util.List;


public interface IProductoService {
    String crearProducto(Producto producto);
    List<Producto> listarProductos();
    Producto buscarPorId(Long id);
    String editarProducto(Long id, Producto producto);
    String eliminarProducto(Long id);
    List<Producto> crearProductos(List<Producto> productos);
}
