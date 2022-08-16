package io.github.joaocika93.albumfigurinhas.service;

import io.github.joaocika93.albumfigurinhas.domain.entity.Jogador;

import java.util.List;

public interface JogadorService {
    List<Jogador> getJogadoresBySelecao(Integer id);
}
