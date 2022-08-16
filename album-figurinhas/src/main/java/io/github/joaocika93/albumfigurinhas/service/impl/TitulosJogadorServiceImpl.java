package io.github.joaocika93.albumfigurinhas.service.impl;

import io.github.joaocika93.albumfigurinhas.domain.entity.Jogador;
import io.github.joaocika93.albumfigurinhas.domain.entity.Titulo;
import io.github.joaocika93.albumfigurinhas.domain.repositories.titulos.TitulosJogadorRepository;
import io.github.joaocika93.albumfigurinhas.service.TitulosJogadorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitulosJogadorServiceImpl implements TitulosJogadorService {

    private final TitulosJogadorRepository titulosJogadorRepository;

    public TitulosJogadorServiceImpl(TitulosJogadorRepository titulosJogadorRepository) {
        this.titulosJogadorRepository = titulosJogadorRepository;
    }

    @Override
    public List<Titulo> getTitulos(Jogador jogador) {
        return titulosJogadorRepository.findTitulosByJogador(jogador);
    }
}
