package com.api.rest.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.api.rest.modelo.Usuario;
import com.api.rest.repository.UsuarioRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final UsuarioRepository usuarioRepository;

    public DataLoader(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void run(String... args) {
        if (usuarioRepository.count() > 0) {
            return;
        }

        usuarioRepository.save(new Usuario("Juan", "Perez", "juan.perez@example.com", "3001112233"));
        usuarioRepository.save(new Usuario("Maria", "Gomez", "maria.gomez@example.com", "3002223344"));
        usuarioRepository.save(new Usuario("Carlos", "Rodriguez", "carlos.rodriguez@example.com", "3003334455"));
        usuarioRepository.save(new Usuario("Laura", "Martinez", "laura.martinez@example.com", "3004445566"));
        usuarioRepository.save(new Usuario("Andres", "Lopez", "andres.lopez@example.com", "3005556677"));
    }
}
