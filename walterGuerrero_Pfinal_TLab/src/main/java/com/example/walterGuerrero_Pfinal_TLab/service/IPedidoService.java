package com.example.walterGuerrero_Pfinal_TLab.service;

import com.example.walterGuerrero_Pfinal_TLab.model.Pedido;
import com.example.walterGuerrero_Pfinal_TLab.model.Producto;

import java.util.List;

public interface IPedidoService {
    String crearPedido(Pedido pedido);
    List<Pedido> listarPedido();
    Producto buscarPorId(Long id);
    String editarPedido(Long id, Pedido pedido);
    String eliminarPedido(Long id);
}
