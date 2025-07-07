package com.example.walterGuerrero_Pfinal_TLab.repository;

import com.example.walterGuerrero_Pfinal_TLab.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByNropedido(int nropedido);
}
