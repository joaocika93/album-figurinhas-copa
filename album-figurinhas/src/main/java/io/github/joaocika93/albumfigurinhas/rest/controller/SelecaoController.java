package io.github.joaocika93.albumfigurinhas.rest.controller;

import io.github.joaocika93.albumfigurinhas.domain.entity.Selecao;
import io.github.joaocika93.albumfigurinhas.service.SelecaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/selecoes")
public class SelecaoController {

    private final SelecaoService selecaoService;

    public SelecaoController(SelecaoService selecaoService) {
        this.selecaoService = selecaoService;
    }

    @GetMapping("/album/{id}")
    public List<Selecao> getSelecoesByAlbum(@PathVariable Integer id) {
        return selecaoService.getSelecoesByAlbum(id);
    }
}
