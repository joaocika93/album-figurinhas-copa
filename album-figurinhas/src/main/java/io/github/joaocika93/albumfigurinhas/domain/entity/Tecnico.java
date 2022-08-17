package io.github.joaocika93.albumfigurinhas.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_tecnicos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tecnico")
    private Integer id;

    @Column(name = "nome_tecnico")
    private String nome;

    @Column(name = "idade_tecnico")
    private Integer idade;

    @OneToMany
    @JoinColumn(name = "titulo_id")
    private List<Titulo> titulos;
}
