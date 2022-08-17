package io.github.joaocika93.albumfigurinhas.service.impl;

import io.github.joaocika93.albumfigurinhas.domain.entity.Jogador;
import io.github.joaocika93.albumfigurinhas.domain.entity.Selecao;
import io.github.joaocika93.albumfigurinhas.domain.repositories.JogadorRepository;
import io.github.joaocika93.albumfigurinhas.domain.repositories.SelecaoRepository;
import io.github.joaocika93.albumfigurinhas.domain.repositories.titulos.TitulosJogadorRepository;
import io.github.joaocika93.albumfigurinhas.exception.SelecaoNaoEncontradaException;
import io.github.joaocika93.albumfigurinhas.service.JogadorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JogadoresServiceImpl implements JogadorService {

    private final JogadorRepository jogadorRepository;

    private final SelecaoRepository selecaoRepository;

    private final TitulosJogadorRepository titulosJogadorRepository;

    public JogadoresServiceImpl(JogadorRepository jogadorRepository, SelecaoRepository selecaoRepository, TitulosJogadorRepository titulosJogadorRepository) {
        this.jogadorRepository = jogadorRepository;
        this.selecaoRepository = selecaoRepository;
        this.titulosJogadorRepository = titulosJogadorRepository;
    }

    @Override
    public List<Jogador> getJogadoresBySelecaoId(Integer id) {
        Selecao selecao = selecaoRepository
                .findById(id)
                .orElseThrow(SelecaoNaoEncontradaException::new);

        var jogadores = jogadorRepository.getAllJogadoresBySelecao(selecao);
        jogadores.stream().map(jogador -> {
            jogador.setTitulos(titulosJogadorRepository.findTitulosByJogador(jogador));
            return jogador;
        }).collect(Collectors.toList());
        return jogadores;
    }

    @Override
    public List<Jogador> getJogadoresBySelecao(Selecao selecao) {
        List<Jogador> jogadores = jogadorRepository.getAllJogadoresBySelecao(selecao);
        jogadores.stream().map(jogador -> {
            jogador.setTitulos(titulosJogadorRepository.findTitulosByJogador(jogador));
            return jogador;
        }).collect(Collectors.toList());
        return jogadores;
    }


}
