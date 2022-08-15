package io.github.joaocika93.albumfigurinhas.domain.repository;

import io.github.joaocika93.albumfigurinhas.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
