package com.github.ClaudirFantuci.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.ClaudirFantuci.backend.model.Imagem;

public interface ImagemRepository extends JpaRepository<Imagem, Long> {
}