package com.example.walterGuerrero_Pfinal_TLab.controller;

import com.example.walterGuerrero_Pfinal_TLab.model.Pedido;
import com.example.walterGuerrero_Pfinal_TLab.model.Producto;
import com.example.walterGuerrero_Pfinal_TLab.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pedido")
@CrossOrigin("*")
public class pedidoController {

    @Autowired
    PedidoService pedServ;
//----------------------------------------------------------
    @PostMapping("/nuevoPedido")
    public String crearProducto(@RequestBody Pedido ped){
        return pedServ.crearPedido(ped);
    }

    @PostMapping("/batchPedidos")
    public List<Pedido> crearProductos(@RequestBody List<Pedido>pedidos){
        return pedServ.crearPedidos(pedidos);
    }

    @GetMapping("/listar")
    public List<Pedido> listarPedidos(){
        return pedServ.listarPedido();
    }

    @GetMapping("/buscar/{id}")
    public Pedido buscarPorId(@PathVariable Long id) {
        return pedServ.buscarPorId(id);
    }

    @GetMapping("/unPedido/{nropedido}")
    public List<Pedido> filtrarPedido(@PathVariable int nropedido){
        return pedServ.filtrarPedido(nropedido);
    }

    @PutMapping("/editar/{id}")
    public String editarPedido(@PathVariable Long id, @RequestBody Pedido ped){
        return pedServ.editarPedido(id,ped);
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarPedido(@PathVariable Long id){
        return pedServ.eliminarPedido(id);
    }

}
