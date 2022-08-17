package io.github.joaocika93.albumfigurinhas.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SelecaoDTO {

    private String nome;
    private String descricao;
    private String emblema;
    private AlbumDTO album;
    private List<TituloDTO> titulos;
    private List<JogadorDTO> jogadores;


}
