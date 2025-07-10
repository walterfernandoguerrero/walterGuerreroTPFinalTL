package com.example.walterGuerrero_Pfinal_TLab.service;

import com.example.walterGuerrero_Pfinal_TLab.model.Usuario;
import com.example.walterGuerrero_Pfinal_TLab.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService{


    @Autowired
    UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo){
        this.repo=repo;
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        repo.save(usuario);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return repo.findAll();
    }

    //sin Override
    public Optional<Usuario>VerificarUser(String dni){
        return repo.findByDni(dni);
    }
}
