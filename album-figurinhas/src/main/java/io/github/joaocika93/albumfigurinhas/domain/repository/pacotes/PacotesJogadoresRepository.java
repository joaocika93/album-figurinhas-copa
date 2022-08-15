package io.github.joaocika93.albumfigurinhas.domain.repository.pacotes;

import io.github.joaocika93.albumfigurinhas.domain.entity.pacotes.PacoteJogadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacotesJogadoresRepository extends JpaRepository<PacoteJogadores, Integer> {
}
