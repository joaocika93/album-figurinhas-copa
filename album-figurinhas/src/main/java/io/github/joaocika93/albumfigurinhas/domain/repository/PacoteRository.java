package io.github.joaocika93.albumfigurinhas.domain.repository;

import io.github.joaocika93.albumfigurinhas.domain.entity.Pacote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacoteRository extends JpaRepository<Pacote, Integer> {
}
