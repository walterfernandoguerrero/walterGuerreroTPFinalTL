package com.example.walterGuerrero_Pfinal_TLab.service;

import com.example.walterGuerrero_Pfinal_TLab.model.Producto;
import com.example.walterGuerrero_Pfinal_TLab.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public  class ProductoService implements IProductoService {

    @Autowired
    ProductoRepository repo;

    public ProductoService(ProductoRepository repo) {
        this.repo = repo;
    }

    @Override
    public String crearProducto(Producto producto) {
        return "";
    }

    @Override
    public List<Producto> listarProductos() {
        return repo.findAll();
    }

    @Override
    public Producto buscarPorId(Long id) {
        return null;
    }

    @Override
    public String editarProducto(Long id, Producto producto) {
        return "";
    }

    @Override
    public String eliminarProducto(Long id) {
        return "";
    }
}
