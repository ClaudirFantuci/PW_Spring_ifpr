package com.github.ClaudirFantuci.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PessoaPerfil {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_perfil")
    private Perfil perfil;
    
    @ManyToOne
    @JoinColumn(name="id_pessoa")
    @JsonIgnore
    private Pessoa pessoa;
}
