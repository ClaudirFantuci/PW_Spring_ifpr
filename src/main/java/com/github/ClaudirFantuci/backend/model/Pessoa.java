package com.github.ClaudirFantuci.backend.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.processing.Generated;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nome;
    private String email;
    private String senha;
}
