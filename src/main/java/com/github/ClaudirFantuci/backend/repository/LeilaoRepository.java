package com.github.ClaudirFantuci.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.ClaudirFantuci.backend.model.Leilao;
import com.github.ClaudirFantuci.backend.enums.StatusLeilao;

public interface LeilaoRepository extends JpaRepository<Leilao, Long> {

    List<Leilao> findByStatus(StatusLeilao status);
}
