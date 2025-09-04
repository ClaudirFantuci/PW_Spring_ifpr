package com.github.ClaudirFantuci.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.ClaudirFantuci.backend.model.PessoaPerfil;

public interface PessoaPerfilRepository extends JpaRepository<PessoaPerfil, Long> {
}