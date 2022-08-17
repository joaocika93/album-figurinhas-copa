package io.github.joaocika93.albumfigurinhas.rest.dto;

import io.github.joaocika93.albumfigurinhas.domain.entity.Jogador;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PacoteJogadoresDTO {
    Set<Jogador> jogadores;
}
