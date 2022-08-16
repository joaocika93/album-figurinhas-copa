package io.github.joaocika93.albumfigurinhas.service;

import io.github.joaocika93.albumfigurinhas.domain.entity.Usuario;
import io.github.joaocika93.albumfigurinhas.rest.dto.UsuarioDTO;

public interface UsuarioService {
    Usuario salvar(UsuarioDTO usuarioDTO);
}
