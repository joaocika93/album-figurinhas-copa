package io.github.joaocika93.albumfigurinhas.domain.entity.pacotes;

import io.github.joaocika93.albumfigurinhas.domain.entity.Jogador;
import io.github.joaocika93.albumfigurinhas.domain.entity.Pacote;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_pacote_jogadores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PacoteJogadores {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pacote_jogadores")
    private Integer id;

    @ManyToMany(mappedBy = "pacotes")
    private List<Jogador> jogadores;

    @ManyToOne
    @JoinColumn(name = "pacote_id")
    private Pacote pacote;
}
