package com.github.ClaudirFantuci.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.ClaudirFantuci.backend.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}