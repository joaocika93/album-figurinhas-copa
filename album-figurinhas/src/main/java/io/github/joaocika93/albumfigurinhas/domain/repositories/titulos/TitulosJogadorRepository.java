package io.github.joaocika93.albumfigurinhas.domain.repositories.titulos;

import io.github.joaocika93.albumfigurinhas.domain.entity.Jogador;
import io.github.joaocika93.albumfigurinhas.domain.entity.Titulo;
import io.github.joaocika93.albumfigurinhas.domain.entity.titulos.TitulosJogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TitulosJogadorRepository extends JpaRepository<TitulosJogador, Integer> {
    @Query("select tj.titulo from TitulosJogador tj where tj.jogador = :jogador")
    List<Titulo> findTitulosByJogador(@Param("jogador") Jogador jogador);
}
