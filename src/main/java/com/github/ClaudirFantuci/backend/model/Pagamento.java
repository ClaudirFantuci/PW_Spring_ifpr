package com.github.ClaudirFantuci.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "{validation.valor.notnull}")
    private Float valor;

    private LocalDateTime dataHora;

    @NotBlank(message = "{validation.status.notblank}")
    private String status;

    @OneToOne
    @JoinColumn(name = "id_leilao")
    private Leilao leilao;
}