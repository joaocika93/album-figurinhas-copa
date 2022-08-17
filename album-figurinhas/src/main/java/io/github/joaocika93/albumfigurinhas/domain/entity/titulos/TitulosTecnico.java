package io.github.joaocika93.albumfigurinhas.domain.entity.titulos;

import io.github.joaocika93.albumfigurinhas.domain.entity.Tecnico;
import io.github.joaocika93.albumfigurinhas.domain.entity.Titulo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_titulos_tecnico")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TitulosTecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_titulo_tecnico")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;

    @ManyToOne
    @JoinColumn(name = "titulo_id")
    private Titulo titulo;
}
