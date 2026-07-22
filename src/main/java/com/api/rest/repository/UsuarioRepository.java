package com.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.rest.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
