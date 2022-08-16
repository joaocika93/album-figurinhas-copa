package io.github.joaocika93.albumfigurinhas.domain.repositories;

import io.github.joaocika93.albumfigurinhas.domain.entity.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
}
