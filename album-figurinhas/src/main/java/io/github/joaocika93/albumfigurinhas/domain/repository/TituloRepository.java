package io.github.joaocika93.albumfigurinhas.domain.repository;

import io.github.joaocika93.albumfigurinhas.domain.entity.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TituloRepository extends JpaRepository<Titulo, Integer> {
}
