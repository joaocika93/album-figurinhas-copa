package io.github.joaocika93.albumfigurinhas.domain.repositories;

import io.github.joaocika93.albumfigurinhas.domain.entity.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TituloRepository extends JpaRepository<Titulo, Integer> {


}
