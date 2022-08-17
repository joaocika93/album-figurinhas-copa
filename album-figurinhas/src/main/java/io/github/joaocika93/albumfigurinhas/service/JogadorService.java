package io.github.joaocika93.albumfigurinhas.service;

import io.github.joaocika93.albumfigurinhas.domain.entity.Jogador;
import io.github.joaocika93.albumfigurinhas.domain.entity.Selecao;

import java.util.List;

public interface JogadorService {
    List<Jogador> getJogadoresBySelecaoId(Integer id);
    List<Jogador> getJogadoresBySelecao(Selecao selecao);
}
