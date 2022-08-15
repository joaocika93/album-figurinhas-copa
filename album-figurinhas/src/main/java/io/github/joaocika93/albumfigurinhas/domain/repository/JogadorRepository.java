package io.github.joaocika93.albumfigurinhas.domain.repository;

import io.github.joaocika93.albumfigurinhas.domain.entity.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Integer> {
}
