package io.github.joaocika93.albumfigurinhas.service;

import io.github.joaocika93.albumfigurinhas.domain.entity.Jogador;
import io.github.joaocika93.albumfigurinhas.domain.entity.Titulo;

import java.util.List;

public interface TitulosJogadorService {
    List<Titulo> getTitulos(Jogador jogador);
}
