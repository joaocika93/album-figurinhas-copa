package io.github.joaocika93.albumfigurinhas.domain.repositories.pacotes;

import io.github.joaocika93.albumfigurinhas.domain.entity.pacotes.PacoteJogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacotesJogadoresRepository extends JpaRepository<PacoteJogador, Integer> {
}
