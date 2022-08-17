package io.github.joaocika93.albumfigurinhas.domain.entity.titulos;

import io.github.joaocika93.albumfigurinhas.domain.entity.Selecao;
import io.github.joaocika93.albumfigurinhas.domain.entity.Titulo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_titulos_selecao")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TitulosSelecao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_titulo_selecao")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "selecao_id")
    private Selecao selecao;

    @ManyToOne
    @JoinColumn(name = "titulo_id")
    private Titulo titulo;
}
