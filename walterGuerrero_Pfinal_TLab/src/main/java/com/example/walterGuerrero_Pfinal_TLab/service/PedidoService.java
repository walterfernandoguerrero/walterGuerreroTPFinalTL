package com.example.walterGuerrero_Pfinal_TLab.service;

import com.example.walterGuerrero_Pfinal_TLab.model.Pedido;
import com.example.walterGuerrero_Pfinal_TLab.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService implements IPedidoService{

    @Autowired
    PedidoRepository repo;


    public PedidoService(PedidoRepository repo){
        this.repo = repo;
    }

    /*
    * public ProductoService(ProductoRepository repo) {
        this.repo = repo;
    }
    * */

    @Override
    public String crearPedido(Pedido pedido) {
        repo.save(pedido);
        return "se creo Pedido";
    }

    @Override
    public List<Pedido> listarPedido() {
        return repo.findAll();
    }

    @Override
    public List<Pedido> filtrarPedido(int nropedido) {
        return repo.findByNropedido(nropedido);
    }

    @Override
    public Pedido buscarPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public String editarPedido(Long id, Pedido pedido) {
        return repo.findById(id).map(ped ->{
            ped.setFecha(pedido.getFecha());
            ped.setNombreCliente(pedido.getNombreCliente());
            ped.setProducto(pedido.getProducto());
            ped.setPrecio(pedido.getPrecio());
            ped.setCantidad(pedido.getCantidad());
            ped.setNropedido(pedido.getNropedido());
            repo.save(ped);
            return "se modifico Pedido";
        }).orElse("pedido existe id de pedido");
    }

    @Override
    public String eliminarPedido(Long id) {
        if(repo.existsById(id)){
          repo.deleteById(id);
          return "se elimino pedido";
        }
        return "no hay pedido con ese id";
    }

    @Override
    public List<Pedido> crearPedidos(List<Pedido> pedidos) {
        return repo.saveAll(pedidos);
    }
}
