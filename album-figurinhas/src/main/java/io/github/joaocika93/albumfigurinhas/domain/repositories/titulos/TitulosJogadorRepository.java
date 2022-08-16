package io.github.joaocika93.albumfigurinhas.domain.repositories.titulos;

import io.github.joaocika93.albumfigurinhas.domain.entity.titulos.TitulosJogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitulosJogadorRepository extends JpaRepository<TitulosJogador, Integer> {
}
