package io.github.joaocika93.albumfigurinhas.rest.dto;

import io.github.joaocika93.albumfigurinhas.domain.entity.Titulo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JogadorDTO {
    private String nome;
    private Integer idade;
    private List<TituloDTO> titulos;
}
