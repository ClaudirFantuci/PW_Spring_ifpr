package com.github.ClaudirFantuci.backend.model;

import java.time.LocalDateTime;
import java.util.List;

import com.github.ClaudirFantuci.backend.enums.StatusLeilao;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "leilao")
public class Leilao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "{validation.titulo.notblank}")
    private String titulo;

    @NotBlank(message = "{validation.descricao.notblank}")
    private String descricao;

    private String descricaoDetalhada;

    private LocalDateTime dataHoraInicio;

    private LocalDateTime dataHoraFim;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "{validation.status.notnull}")
    private StatusLeilao status;

    private String observacao;

    @NotNull(message = "{validation.valorIncremento.notnull}")
    private Float valorIncremento;

    @NotNull(message = "{validation.lanceMinimo.notnull}")
    private Float lanceMinimo;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    @NotNull(message = "{validation.categoria.notnull}")
    private Categoria categoria;

    @OneToMany(mappedBy = "leilao", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Imagem> imagens;

    @OneToMany(mappedBy = "leilao", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Lance> lances;

    @OneToOne(mappedBy = "leilao", cascade = CascadeType.ALL, orphanRemoval = true)
    private Pagamento pagamento;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    @NotNull(message = "{validation.publicador.notnull}")
    private Pessoa publicador;
}