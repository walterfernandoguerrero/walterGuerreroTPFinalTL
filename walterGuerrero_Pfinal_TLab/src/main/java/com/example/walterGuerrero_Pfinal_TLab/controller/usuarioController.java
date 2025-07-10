package com.example.walterGuerrero_Pfinal_TLab.controller;

import com.example.walterGuerrero_Pfinal_TLab.model.Usuario;
import com.example.walterGuerrero_Pfinal_TLab.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class usuarioController {

    @Autowired
    UsuarioService us;

    @GetMapping("/list")
    public List<Usuario> listarUsuarios(){
        return us.listarUsuarios();
    }
    @PostMapping("/nuevoUS")
    public void  crearUsuario(@RequestBody Usuario usuario){
        us.crearUsuario(usuario);
    }



}
