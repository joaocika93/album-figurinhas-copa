package io.github.joaocika93.albumfigurinhas.exception;

public class UsuarioJaExisteException extends RuntimeException{

    public UsuarioJaExisteException() {
        super("Usuario já existe.");
    }
}
