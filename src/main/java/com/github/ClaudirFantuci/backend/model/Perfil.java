package com.github.ClaudirFantuci.backend.model;

import com.github.ClaudirFantuci.backend.enums.TipoPerfil;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "{validation.tipo.notnull}")
    private TipoPerfil tipo;
}