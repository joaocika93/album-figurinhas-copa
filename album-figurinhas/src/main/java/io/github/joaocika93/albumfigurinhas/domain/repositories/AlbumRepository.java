package io.github.joaocika93.albumfigurinhas.domain.repositories;

import io.github.joaocika93.albumfigurinhas.domain.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {
}
