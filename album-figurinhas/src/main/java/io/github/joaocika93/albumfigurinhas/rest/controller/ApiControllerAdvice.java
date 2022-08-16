package io.github.joaocika93.albumfigurinhas.rest.controller;

import io.github.joaocika93.albumfigurinhas.exception.*;
import io.github.joaocika93.albumfigurinhas.rest.ApiErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiControllerAdvice {

    @ExceptionHandler(AlbumNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiErrors handleAlbumNaoEncontradoException(AlbumNaoEncontradoException ex) {
        return new ApiErrors(ex.getMessage());
    }

    @ExceptionHandler(UsuarioJaExisteException.class)
    @ResponseStatus(HttpStatus.FOUND)
    public ApiErrors handleUsuarioJaExisteException(UsuarioJaExisteException ex) {
        return new ApiErrors(ex.getMessage());
    }

    @ExceptionHandler(NenhumaSelecaoCadastradaNoAlbumException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiErrors handleNenhumaSelecaoCadastradaNoAlbumException(NenhumaSelecaoCadastradaNoAlbumException ex) {
        return new ApiErrors(ex.getMessage());
    }

    @ExceptionHandler(SelecaoNaoEncontradaException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiErrors handleSelecaoNaoEncontradaException(SelecaoNaoEncontradaException ex) {
        return new ApiErrors(ex.getMessage());
    }

    @ExceptionHandler(JogadorNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiErrors handleJogadorNaoEncontradoException(JogadorNaoEncontradoException ex) {
        return new ApiErrors(ex.getMessage());
    }

}
