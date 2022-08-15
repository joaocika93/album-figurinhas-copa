package io.github.joaocika93.albumfigurinhas.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_titulos")
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

}
