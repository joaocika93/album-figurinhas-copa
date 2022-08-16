package io.github.joaocika93.albumfigurinhas.exception;

public class NenhumaSelecaoCadastradaNoAlbumException extends RuntimeException {

    public NenhumaSelecaoCadastradaNoAlbumException() {
        super("Nenhuma selecão cadastrada para esse album");
    }
}
