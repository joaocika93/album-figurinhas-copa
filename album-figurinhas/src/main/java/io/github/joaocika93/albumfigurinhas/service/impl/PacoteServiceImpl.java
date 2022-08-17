package io.github.joaocika93.albumfigurinhas.service.impl;

import io.github.joaocika93.albumfigurinhas.domain.entity.Jogador;
import io.github.joaocika93.albumfigurinhas.domain.entity.Pacote;
import io.github.joaocika93.albumfigurinhas.domain.entity.pacotes.PacoteJogador;
import io.github.joaocika93.albumfigurinhas.domain.repositories.JogadorRepository;
import io.github.joaocika93.albumfigurinhas.domain.repositories.PacoteRository;
import io.github.joaocika93.albumfigurinhas.domain.repositories.pacotes.PacotesJogadoresRepository;
import io.github.joaocika93.albumfigurinhas.rest.dto.PacoteJogadoresDTO;
import io.github.joaocika93.albumfigurinhas.service.PacoteService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class PacoteServiceImpl implements PacoteService {

    private final Integer NUMERO_ABSOLUTO_JOGADORES_PACOTE = 5;

    private final JogadorRepository jogadorRepository;

    private final PacoteRository pacoteRository;

    private final PacotesJogadoresRepository pacotesJogadoresRepository;

    public PacoteServiceImpl(JogadorRepository jogadorRepository, PacoteRository pacoteRository, PacotesJogadoresRepository pacotesJogadoresRepository) {
        this.jogadorRepository = jogadorRepository;
        this.pacoteRository = pacoteRository;
        this.pacotesJogadoresRepository = pacotesJogadoresRepository;
    }

    @Override
    public Set<PacoteJogadoresDTO> gerarPacotesPorQuantidade(Integer quantidade) {
        Random random = new Random();
        var allJogadores = jogadorRepository.findAll();
        Set<PacoteJogadoresDTO> pacoteJogadoresList = new HashSet<>();

        for (int i = 0; i < quantidade; i++) {
        Pacote pacote = new Pacote();
        Set<Jogador> jogadores = new HashSet<>();
        pacoteRository.save(pacote);
        PacoteJogadoresDTO pacoteJogadores = new PacoteJogadoresDTO();
            for (int j = 0; j <= NUMERO_ABSOLUTO_JOGADORES_PACOTE; j++) {
                var indexSorteado = random.nextInt(allJogadores.size());
                var jogadorSorteado = allJogadores.get(indexSorteado);

                PacoteJogador pacoteJogador = new PacoteJogador();
                pacoteJogador.setPacote(pacote);
                pacoteJogador.setJogador(jogadorSorteado);
                pacotesJogadoresRepository.save(pacoteJogador);

                jogadores.add(jogadorSorteado);
            }
            pacoteJogadores.setJogadores(jogadores);
            pacoteJogadoresList.add(pacoteJogadores);
        }

        return pacoteJogadoresList;
    }

}
