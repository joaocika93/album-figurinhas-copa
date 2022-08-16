package io.github.joaocika93.albumfigurinhas.rest.controller;

import io.github.joaocika93.albumfigurinhas.domain.entity.Usuario;
import io.github.joaocika93.albumfigurinhas.rest.dto.UsuarioDTO;
import io.github.joaocika93.albumfigurinhas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Integer save(@RequestBody UsuarioDTO dto) {
        Usuario usuario = usuarioService.salvar(dto);
        return usuario.getId();
    }

}
