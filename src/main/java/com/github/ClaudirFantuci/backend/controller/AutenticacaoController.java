package com.github.ClaudirFantuci.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.ClaudirFantuci.backend.dto.PessoaRequestDTO;
import com.github.ClaudirFantuci.backend.service.AutenticacaoService;

@RestController
@RequestMapping("/autenticacao")
public class AutenticacaoController {

    @Autowired
    private AutenticacaoService autenticacaoService;

    @PostMapping("/login")
    public String login(@RequestBody PessoaRequestDTO pessoa) {
        return autenticacaoService.autenticar(pessoa);
    }
}
