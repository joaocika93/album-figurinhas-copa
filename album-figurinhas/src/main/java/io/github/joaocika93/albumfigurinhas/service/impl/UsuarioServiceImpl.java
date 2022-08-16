package io.github.joaocika93.albumfigurinhas.service.impl;

import io.github.joaocika93.albumfigurinhas.domain.entity.Album;
import io.github.joaocika93.albumfigurinhas.domain.entity.Usuario;
import io.github.joaocika93.albumfigurinhas.domain.repositories.AlbumRepository;
import io.github.joaocika93.albumfigurinhas.domain.repositories.UsuarioRepository;
import io.github.joaocika93.albumfigurinhas.exception.AlbumNaoEncontradoException;
import io.github.joaocika93.albumfigurinhas.exception.UsuarioJaExisteException;
import io.github.joaocika93.albumfigurinhas.rest.dto.UsuarioDTO;
import io.github.joaocika93.albumfigurinhas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    private final AlbumRepository albumRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository, AlbumRepository albumRepository) {
        this.usuarioRepository = usuarioRepository;
        this.albumRepository = albumRepository;
    }

    @Override
    @Transactional
    public Usuario salvar(UsuarioDTO usuarioDTO) {
        Integer albumId = usuarioDTO.getAlbum();
        Usuario usuario = new Usuario();

        usuario.setNome(usuarioDTO.getNome());
        usuario.setSenha(usuarioDTO.getSenha());

        Album album = albumRepository
                .findById(albumId)
                .orElseThrow(AlbumNaoEncontradoException::new);
        usuario.setAlbum(album);

        if(!containsUsuario(usuario)) {
            throw new UsuarioJaExisteException();
        }
        return usuarioRepository.save(usuario);
    }

    public Boolean containsUsuario (Usuario filtro) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING
                );
        Example<Usuario> example = Example.of(filtro, matcher);
        return usuarioRepository.findAll(example).isEmpty();
    }
}
