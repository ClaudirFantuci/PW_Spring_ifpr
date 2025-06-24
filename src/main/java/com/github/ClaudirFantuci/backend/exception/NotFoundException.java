package com.github.ClaudirFantuci.backend.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String mensagem){
        super(mensagem);
    }
    
}
