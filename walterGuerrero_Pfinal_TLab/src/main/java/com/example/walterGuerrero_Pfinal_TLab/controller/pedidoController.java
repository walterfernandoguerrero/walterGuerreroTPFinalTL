package com.example.walterGuerrero_Pfinal_TLab.controller;

import com.example.walterGuerrero_Pfinal_TLab.model.Pedido;
import com.example.walterGuerrero_Pfinal_TLab.model.Producto;
import com.example.walterGuerrero_Pfinal_TLab.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pedido")
@CrossOrigin("*")
public class pedidoController {

    @Autowired
    PedidoService pedServ;

    @PostMapping("/nuevoPedido")
    public String crearProducto(@RequestBody Pedido ped){
        return pedServ.crearPedido(ped);
    }

}
