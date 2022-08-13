package io.github.joaocika93.albumfigurinhas.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_titulo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_titulo")
    private Long id;

    @Column(name = "nome_titulo")
    private String nome;

    @ManyToMany(mappedBy = "titulos")
    private List<Jogador> jogadores;

    @ManyToMany(mappedBy = "titulos")
    private List<Selecao> selecoes;
}
