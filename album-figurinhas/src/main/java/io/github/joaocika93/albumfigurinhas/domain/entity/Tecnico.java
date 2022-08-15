package io.github.joaocika93.albumfigurinhas.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_tecnicos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tecnico")
    private Long id;

    @Column(name = "nome_tecnico")
    private String nome;

    @Column(name = "idade_tecnico")
    private Integer idade;
}
