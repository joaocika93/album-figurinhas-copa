package io.github.joaocika93.albumfigurinhas.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_selecoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Selecao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_selecao")
    private Integer id;

    @Column(name = "nome_selecao")
    private String nome;

    @Column(name = "descricao_selecao")
    private String descricao;

    @Column(name = "emblema_selecao")
    private String emblema;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;

}
