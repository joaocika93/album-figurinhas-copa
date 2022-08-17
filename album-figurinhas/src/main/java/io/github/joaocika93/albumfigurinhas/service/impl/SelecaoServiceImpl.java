package io.github.joaocika93.albumfigurinhas.service.impl;

import io.github.joaocika93.albumfigurinhas.domain.entity.Album;
import io.github.joaocika93.albumfigurinhas.domain.entity.Selecao;
import io.github.joaocika93.albumfigurinhas.domain.entity.Tecnico;
import io.github.joaocika93.albumfigurinhas.domain.repositories.AlbumRepository;
import io.github.joaocika93.albumfigurinhas.domain.repositories.SelecaoRepository;
import io.github.joaocika93.albumfigurinhas.domain.repositories.titulos.TitulosSelecaoRepository;
import io.github.joaocika93.albumfigurinhas.domain.repositories.titulos.TitulosTecnicoRepository;
import io.github.joaocika93.albumfigurinhas.exception.AlbumNaoEncontradoException;
import io.github.joaocika93.albumfigurinhas.exception.NenhumaSelecaoCadastradaNoAlbumException;
import io.github.joaocika93.albumfigurinhas.rest.dto.SelecaoDTO;
import io.github.joaocika93.albumfigurinhas.service.JogadorService;
import io.github.joaocika93.albumfigurinhas.service.SelecaoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SelecaoServiceImpl implements SelecaoService {

    private final SelecaoRepository selecaoRepository;

    private final AlbumRepository albumRepository;

    private final TitulosSelecaoRepository titulosSelecaoRepository;

    private final TitulosTecnicoRepository titulosTecnicoRepository;

    private final JogadorService jogadorService;

    private final ModelMapper modelMapper;

    public SelecaoServiceImpl(SelecaoRepository selecaoRepository, AlbumRepository albumRepository, TitulosSelecaoRepository titulosSelecaoRepository, TitulosTecnicoRepository titulosTecnicoRepository, JogadorService jogadorService, ModelMapper modelMapper) {
        this.selecaoRepository = selecaoRepository;
        this.albumRepository = albumRepository;
        this.titulosSelecaoRepository = titulosSelecaoRepository;
        this.titulosTecnicoRepository = titulosTecnicoRepository;
        this.jogadorService = jogadorService;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<SelecaoDTO> getSelecoesByAlbum(Integer id) {
        Album album = albumRepository
                .findById(id)
                .orElseThrow(AlbumNaoEncontradoException::new);

        var selecoes = selecaoRepository.findAllSelecoesByAlbum(album);
        if (selecoes.isEmpty()) {
            throw new NenhumaSelecaoCadastradaNoAlbumException();
        }

        return getSelecoesWithTecnicosAndTitulos(selecoes)
                .stream()
                .map(this::convertSelecaoToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Selecao> getSelecoesWithTecnicosAndTitulos(List<Selecao> selecoes) {
        return selecoes
                .stream()
                .map(selecao -> {
                    selecao.setTitulos(titulosSelecaoRepository.findTitulosBySelecao(selecao));

                    Tecnico tecnico = selecao.getTecnico();
                    tecnico.setTitulos(titulosTecnicoRepository.findTitulosByTecnico(tecnico));
                    selecao.setTecnico(tecnico);

                    selecao.setJogadores(jogadorService.getJogadoresBySelecao(selecao));

                    return selecao;
                }).collect(Collectors.toList());
    }

    public SelecaoDTO convertSelecaoToDto(Selecao selecao) {
        return modelMapper.map(selecao, SelecaoDTO.class);
    }

}
