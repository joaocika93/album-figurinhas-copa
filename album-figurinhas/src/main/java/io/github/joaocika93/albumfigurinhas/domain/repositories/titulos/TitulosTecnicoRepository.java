package io.github.joaocika93.albumfigurinhas.domain.repositories.titulos;

import io.github.joaocika93.albumfigurinhas.domain.entity.Tecnico;
import io.github.joaocika93.albumfigurinhas.domain.entity.Titulo;
import io.github.joaocika93.albumfigurinhas.domain.entity.titulos.TitulosTecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TitulosTecnicoRepository extends JpaRepository<TitulosTecnico, Integer> {

    @Query("select tt.titulo from TitulosTecnico tt where tt.tecnico = :tecnico")
    List<Titulo> findTitulosByTecnico(@Param("tecnico") Tecnico tecnico);
}
