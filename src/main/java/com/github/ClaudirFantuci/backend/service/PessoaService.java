package com.github.ClaudirFantuci.backend.service;
import com.github.ClaudirFantuci.backend.exception.NotFoundException;
import com.github.ClaudirFantuci.backend.model.Pessoa;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import com.github.ClaudirFantuci.backend.repository.PessoaRepository;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private MessageSource messageSource;

    public Pessoa inserir(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa alterar(Pessoa pessoa) {
        // return pessoaRepository.save(pessoa);
        Pessoa pessoaBanco = buscarPorId(pessoa.getId());
        pessoaBanco.setNome(pessoa.getNome());
        pessoaBanco.setEmail(pessoa.getEmail());
        return pessoaRepository.save(pessoaBanco);
    }

    public void remover(Long id) {
        Pessoa pessoaBanco = buscarPorId(id);
        pessoaRepository.delete(pessoaBanco);
    }

    public Pessoa buscarPorId(Long id) {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(messageSource.getMessage("pessoa.notfound",
                        new Object[] { id }, LocaleContextHolder.getLocale())));
    }

    public List<Pessoa> buscarTodos() {
        return pessoaRepository.findAll();
    }
}
