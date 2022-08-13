package io.github.joaocika93.albumfigurinhas.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_selecao")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Selecao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_selecao")
    private Long id;

    @Column(name = "nome_selecao")
    private String nome;

    @Column(name = "descricao_selecao")
    private String descricao;

    @ManyToMany
    @JoinTable(name = "titulos_selecao",
            joinColumns = {@JoinColumn(name = "id_selecao")},
            inverseJoinColumns = {@JoinColumn(name = "id_titulo")}
    )
    private List<Titulo> titulos;

    @ManyToOne
    @JoinColumn(name = "album_selecao")
    private Album album;

}
