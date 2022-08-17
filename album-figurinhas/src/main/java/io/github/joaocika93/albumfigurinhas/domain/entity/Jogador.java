package io.github.joaocika93.albumfigurinhas.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_jogadores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_jogador")
    private Integer id;

    @Column(name = "nome_jogador")
    private String nome;

    @Column(name = "idade_jogador")
    private Integer idade;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "selecao_id")
    private Selecao selecao;

    @OneToMany
    @JoinColumn(name = "titulo_id")
    private List<Titulo> titulos;

    @ManyToMany
    @JoinTable(name = "tb_pacote_jogadores",
            joinColumns = {@JoinColumn(name = "jogador_id")},
            inverseJoinColumns = {@JoinColumn(name = "id_jogador")})
    private List<Pacote> pacotes;


}
