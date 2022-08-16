package io.github.joaocika93.albumfigurinhas.service.impl;

import io.github.joaocika93.albumfigurinhas.domain.entity.Album;
import io.github.joaocika93.albumfigurinhas.domain.entity.Jogador;
import io.github.joaocika93.albumfigurinhas.domain.entity.Selecao;
import io.github.joaocika93.albumfigurinhas.domain.repositories.AlbumRepository;
import io.github.joaocika93.albumfigurinhas.domain.repositories.SelecaoRepository;
import io.github.joaocika93.albumfigurinhas.exception.AlbumNaoEncontradoException;
import io.github.joaocika93.albumfigurinhas.exception.NenhumaSelecaoCadastradaNoAlbumException;
import io.github.joaocika93.albumfigurinhas.service.JogadorService;
import io.github.joaocika93.albumfigurinhas.service.SelecaoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelecaoServiceImpl implements SelecaoService {

    private final SelecaoRepository selecaoRepository;

    private final AlbumRepository albumRepository;

    private final JogadorService jogadorService;

    public SelecaoServiceImpl(SelecaoRepository selecaoRepository, AlbumRepository albumRepository, JogadorService jogadorService) {
        this.selecaoRepository = selecaoRepository;
        this.albumRepository = albumRepository;
        this.jogadorService = jogadorService;
    }

    @Override
    public List<Selecao> getSelecoesByAlbum(Integer id) {
        Album album = albumRepository
                .findById(id)
                .orElseThrow(AlbumNaoEncontradoException::new);
        List<Selecao> selecoes = selecaoRepository.findAllSelecoesByAlbum(album);

        if(selecoes.isEmpty()) {throw new NenhumaSelecaoCadastradaNoAlbumException();}
        return selecoes;
    }
}
