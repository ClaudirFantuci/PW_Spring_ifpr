package com.github.ClaudirFantuci.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.github.ClaudirFantuci.backend.model.PessoaRequestDTO;
import com.github.ClaudirFantuci.backend.security.JwtService;

@Service
public class AutenticacaoService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    public String autenticar(PessoaRequestDTO pessoa) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(pessoa.getEmail(), pessoa.getPassword()));

        return jwtService.generateToken(authentication.getName());
    }
}
