package io.github.joaocika93.albumfigurinhas.domain.repositories;

import io.github.joaocika93.albumfigurinhas.domain.entity.Album;
import io.github.joaocika93.albumfigurinhas.domain.entity.Selecao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SelecaoRepository extends JpaRepository<Selecao, Integer> {

    @Query(" select s from Selecao s where s.album = :album ")
    List<Selecao> findAllSelecoesByAlbum(@Param("album") Album album);

}
