package com.example.walterGuerrero_Pfinal_TLab.service;

import com.example.walterGuerrero_Pfinal_TLab.model.Pedido;
import com.example.walterGuerrero_Pfinal_TLab.model.Producto;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface IPedidoService {
    String crearPedido(Pedido pedido);
    List<Pedido> listarPedido();
    List<Pedido> filtrarPedido(int nropedido);
    Pedido buscarPorId(Long id);
    String editarPedido(Long id, Pedido pedido);
    String eliminarPedido(Long id);
    List<Pedido>crearPedidos(List<Pedido>pedidos);
}
