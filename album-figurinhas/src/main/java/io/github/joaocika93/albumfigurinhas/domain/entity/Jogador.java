package io.github.joaocika93.albumfigurinhas.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_jogador")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_jogador")
    private Long id;

    @Column(name = "nome_jogador")
    private String nome;

    @Column(name = "idade_jogador")
    private Integer idade;

    @ManyToMany
    @JoinTable(name = "titulos_jogador",
            joinColumns = {@JoinColumn(name = "id_jogador")},
            inverseJoinColumns = {@JoinColumn(name = "id_titulo")})
    private List<Titulo> titulos;

    @ManyToOne
    @JoinColumn(name = "selecao_jogador")
    private Selecao selecao;

}
