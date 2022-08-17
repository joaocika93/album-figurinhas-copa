package io.github.joaocika93.albumfigurinhas.service;

import io.github.joaocika93.albumfigurinhas.domain.entity.Pacote;
import io.github.joaocika93.albumfigurinhas.rest.dto.PacoteJogadoresDTO;

import java.util.Set;

public interface PacoteService {

    Set<PacoteJogadoresDTO> gerarPacotesPorQuantidade(Integer quantidade);
}
