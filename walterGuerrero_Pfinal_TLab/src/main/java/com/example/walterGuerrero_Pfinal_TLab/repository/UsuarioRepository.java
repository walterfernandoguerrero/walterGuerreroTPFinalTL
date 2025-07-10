package com.example.walterGuerrero_Pfinal_TLab.repository;

import com.example.walterGuerrero_Pfinal_TLab.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByDni(String dni);
}
