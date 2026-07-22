package com.api.rest.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.api.rest.modelo.Usuario;
import com.api.rest.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public Usuario obtener(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado: " + id));
    }

    public Usuario crear(Usuario usuario) {
        usuario.setId(null);
        return usuarioRepository.save(usuario);
    }

    public Usuario actualizar(Long id, Usuario datos) {
        Usuario usuario = obtener(id);
        usuario.setNombre(datos.getNombre());
        usuario.setApellido(datos.getApellido());
        usuario.setEmail(datos.getEmail());
        usuario.setTelefono(datos.getTelefono());
        return usuarioRepository.save(usuario);
    }

    public void eliminar(Long id) {
        if (!usuarioRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado: " + id);
        }
        usuarioRepository.deleteById(id);
    }
}
