package com.example.walterGuerrero_Pfinal_TLab.service;

import com.example.walterGuerrero_Pfinal_TLab.model.Usuario;

import java.util.List;

public interface IUsuarioService {
    void crearUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
}
