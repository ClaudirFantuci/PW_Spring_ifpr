package com.github.ClaudirFantuci.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comentario;

    private Integer nota;

    private LocalDateTime dataHora;

    @ManyToOne
    @JoinColumn(name = "id_pessoa_destinatario")
    @NotNull(message = "{validation.destinatario.notnull}")
    private Pessoa destinatario;
}