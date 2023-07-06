package com.mscompra.service.exception;

public class PessoaNotFoundException extends com.mscompra.service.exception.EntidadeNaoEncontradaException {

    public PessoaNotFoundException(String mensagem) {
        super(mensagem);
    }

    public PessoaNotFoundException(Long id) {
        this(String.format("Não existe uma pessoa com o id: %s na base de dados!", id));
    }

}