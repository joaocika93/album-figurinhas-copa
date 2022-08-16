package io.github.joaocika93.albumfigurinhas.rest.controller;

import io.github.joaocika93.albumfigurinhas.domain.entity.Album;
import io.github.joaocika93.albumfigurinhas.domain.repositories.AlbumRepository;
import io.github.joaocika93.albumfigurinhas.exception.AlbumNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/album")
public class AlbumController {

    private final AlbumRepository albumRepository;

    public AlbumController(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @GetMapping("/{id}")
    public Album getAlbumById(@PathVariable Integer id){
        return albumRepository
                .findById(id)
                .orElseThrow(AlbumNaoEncontradoException::new);
    }
}
