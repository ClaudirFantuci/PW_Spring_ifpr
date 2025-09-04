package com.github.ClaudirFantuci.backend.model;


import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name = "imagem")
public class Imagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "{validation.nomeImagem.notblank}")
    private String nomeImagem;

    private LocalDateTime dataHoraCadastro;

    @ManyToOne
    @JoinColumn(name = "id_leilao")
    private Leilao leilao;
}