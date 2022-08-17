package io.github.joaocika93.albumfigurinhas.rest.controller;

import io.github.joaocika93.albumfigurinhas.domain.entity.Pacote;
import io.github.joaocika93.albumfigurinhas.rest.dto.PacoteJogadoresDTO;
import io.github.joaocika93.albumfigurinhas.service.PacoteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/pacotes")
public class PacoteController {

    private final PacoteService pacoteService;

    public PacoteController(PacoteService pacoteService) {
        this.pacoteService = pacoteService;
    }

    @PostMapping("/{quantidade}")
    @ResponseStatus(HttpStatus.CREATED)
    public Set<PacoteJogadoresDTO> gerarPacotesPorQuantidade(@PathVariable Integer quantidade) {
        return pacoteService.gerarPacotesPorQuantidade(quantidade);
    }
}
