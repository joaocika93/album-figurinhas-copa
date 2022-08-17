package io.github.joaocika93.albumfigurinhas.service;

import io.github.joaocika93.albumfigurinhas.domain.entity.Selecao;
import io.github.joaocika93.albumfigurinhas.rest.dto.SelecaoDTO;

import java.util.List;

public interface SelecaoService {
    List<SelecaoDTO> getSelecoesByAlbum(Integer id);

    List<Selecao> getSelecoesWithTecnicosAndTitulos(List<Selecao> selecoes);
}
