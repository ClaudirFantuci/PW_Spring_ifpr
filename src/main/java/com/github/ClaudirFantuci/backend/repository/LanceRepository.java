package com.github.ClaudirFantuci.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.ClaudirFantuci.backend.model.Lance;

public interface LanceRepository extends JpaRepository<Lance, Long> {
}