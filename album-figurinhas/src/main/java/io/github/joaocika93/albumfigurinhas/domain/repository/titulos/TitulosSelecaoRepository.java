package io.github.joaocika93.albumfigurinhas.domain.repository.titulos;

import io.github.joaocika93.albumfigurinhas.domain.entity.titulos.TitulosSelecao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitulosSelecaoRepository extends JpaRepository<TitulosSelecao, Integer> {
}
