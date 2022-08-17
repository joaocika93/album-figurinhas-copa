package io.github.joaocika93.albumfigurinhas.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TecnicoDTO {

    private String nome;
    private Integer idade;
    private List<TituloDTO> titulos;

}
