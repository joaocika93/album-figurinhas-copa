package io.github.joaocika93.albumfigurinhas.domain.entity.titulos;

import io.github.joaocika93.albumfigurinhas.domain.entity.Jogador;
import io.github.joaocika93.albumfigurinhas.domain.entity.Titulo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_titulos_jogador")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TitulosJogador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_titulo_jogador")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "jogador_id")
    private Jogador jogador;

    @ManyToOne
    @JoinColumn(name = "titulo_id")
    private Titulo titulo;
}
