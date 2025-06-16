package com.github.ClaudirFantuci.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.ClaudirFantuci.backend.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
