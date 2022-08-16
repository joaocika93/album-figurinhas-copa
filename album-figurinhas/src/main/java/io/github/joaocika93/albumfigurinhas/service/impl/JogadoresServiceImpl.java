package io.github.joaocika93.albumfigurinhas.service.impl;

import io.github.joaocika93.albumfigurinhas.domain.entity.Jogador;
import io.github.joaocika93.albumfigurinhas.domain.entity.Selecao;
import io.github.joaocika93.albumfigurinhas.domain.repositories.JogadorRepository;
import io.github.joaocika93.albumfigurinhas.domain.repositories.SelecaoRepository;
import io.github.joaocika93.albumfigurinhas.exception.SelecaoNaoEncontradaException;
import io.github.joaocika93.albumfigurinhas.service.JogadorService;
import io.github.joaocika93.albumfigurinhas.service.TitulosJogadorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JogadoresServiceImpl implements JogadorService {

    private final JogadorRepository jogadorRepository;

    private final SelecaoRepository selecaoRepository;

    private final TitulosJogadorService titulosJogadorService;

    public JogadoresServiceImpl(JogadorRepository jogadorRepository, SelecaoRepository selecaoRepository, TitulosJogadorServiceImpl tituloService) {
        this.jogadorRepository = jogadorRepository;
        this.selecaoRepository = selecaoRepository;
        this.titulosJogadorService = tituloService;
    }

    @Override
    public List<Jogador> getJogadoresBySelecao(Integer id) {
        Selecao selecao = selecaoRepository
                .findById(id)
                .orElseThrow(SelecaoNaoEncontradaException::new);

        List<Jogador> jogadores = jogadorRepository.getAllJogadoresBySelecao(selecao);
        jogadores.stream().map(jogador -> {
            jogador.setTitulos(titulosJogadorService.getTitulos(jogador));
            return jogador;
        }).collect(Collectors.toList());
        return jogadores;
    }
}
