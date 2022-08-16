package io.github.joaocika93.albumfigurinhas.domain.repositories;

import io.github.joaocika93.albumfigurinhas.domain.entity.Jogador;
import io.github.joaocika93.albumfigurinhas.domain.entity.Selecao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Integer> {
    @Query(" select j from Jogador j where j.selecao = :selecao")
    List<Jogador> getAllJogadoresBySelecao(@Param("selecao") Selecao selecao);
}
