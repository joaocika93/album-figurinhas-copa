package io.github.joaocika93.albumfigurinhas.domain.repositories.titulos;

import io.github.joaocika93.albumfigurinhas.domain.entity.Selecao;
import io.github.joaocika93.albumfigurinhas.domain.entity.Titulo;
import io.github.joaocika93.albumfigurinhas.domain.entity.titulos.TitulosSelecao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TitulosSelecaoRepository extends JpaRepository<TitulosSelecao, Integer> {

    @Query("select ts.titulo from TitulosSelecao ts where ts.selecao = :selecao")
    List<Titulo> findTitulosBySelecao(@Param("selecao") Selecao selecao);
}
