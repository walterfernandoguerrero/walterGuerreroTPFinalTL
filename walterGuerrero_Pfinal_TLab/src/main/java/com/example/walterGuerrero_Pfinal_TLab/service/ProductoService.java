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
        repo.save(producto);
        return "Se creo nuevo producto";
    }

    @Override
    public List<Producto> listarProductos() {
        return repo.findAll();
    }

    @Override
    public Producto buscarPorId(Long id) {
        return  repo.findById(id).orElse(null);

    }

    @Override
    public String editarProducto(Long id, Producto prod) {
        return repo.findById(id).map(p -> {
            p.setNombre(prod.getNombre());
            p.setDescripcion(prod.getDescripcion());
            p.setUrl_imagen(prod.getUrl_imagen());
            p.setPrecio(prod.getPrecio());
            p.setCategoria(prod.getCategoria());
            p.setStock(prod.getStock());
            repo.save(p);
            return "Producto actualizado correctamente";
        }).orElse("Producto no encontrado");

    }

    @Override
    public String eliminarProducto(Long id) {
        if(repo.existsById(id))
            {
                repo.deleteById(id);
                return "se elimino producto";
            }
        return "no hay producto con ese id";
    }

    @Override
    public List<Producto> crearProductos(List<Producto> productos) {
        return repo.saveAll(productos);
    }
}
