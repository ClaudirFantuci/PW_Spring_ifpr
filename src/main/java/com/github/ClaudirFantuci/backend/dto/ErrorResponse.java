package com.github.ClaudirFantuci.backend.dto;

import java.util.List;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ErrorResponse {

    private LocalDateTime dataHora;
    private int codigo;
    private String erro;
    private String mensagem;
    private String caminho;
    private List<String> detalhes;

    public ErrorResponse(int codigo, String erro, String mensagem, String caminho, List<String> detalhes) {
        dataHora = LocalDateTime.now();
        this.codigo = codigo;
        this.erro = erro;
        this.caminho = caminho;
        this.mensagem = mensagem;
        this.detalhes = detalhes;
    }
}