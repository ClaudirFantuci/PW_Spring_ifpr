package com.github.ClaudirFantuci.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.ClaudirFantuci.backend.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    public Optional<Pessoa> findByEmail(String email);
}
