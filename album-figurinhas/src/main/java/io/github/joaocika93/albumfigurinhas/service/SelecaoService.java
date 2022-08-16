package io.github.joaocika93.albumfigurinhas.service;

import io.github.joaocika93.albumfigurinhas.domain.entity.Selecao;

import java.util.List;

public interface SelecaoService {
    List<Selecao> getSelecoesByAlbum(Integer id);
}
