package com.github.ClaudirFantuci.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.github.ClaudirFantuci.backend.dto.PessoaAutenticacaoDTO;
import com.github.ClaudirFantuci.backend.dto.PessoaRequestDTO;
import com.github.ClaudirFantuci.backend.model.Pessoa;
import com.github.ClaudirFantuci.backend.repository.PessoaRepository;
import com.github.ClaudirFantuci.backend.security.JwtService;

@Service
public class AutenticacaoService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @Autowired
    PessoaRepository pessoaRepository;

    public PessoaAutenticacaoDTO autenticar(PessoaRequestDTO pessoa) {


        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(pessoa.getEmail(), pessoa.getSenha()));
        Pessoa pessoaBanco = pessoaRepository.findByEmail(pessoa.getEmail()).get();
        PessoaAutenticacaoDTO autenticacaoDTO = new PessoaAutenticacaoDTO();
        autenticacaoDTO.setEmail(pessoaBanco.getEmail());
        autenticacaoDTO.setNome(pessoaBanco.getNome());
        autenticacaoDTO.setToken(jwtService.generateToken(authentication.getName()));


        
        return autenticacaoDTO;
    }
}
