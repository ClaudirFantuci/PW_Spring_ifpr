package com.github.ClaudirFantuci.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "calculadora")
public class Calculadora {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer v1;
    private Integer v2;

    private Integer resultado;

    public Integer getV1() {
        return v1;
    }

    public void setV1(Integer v1) {
        this.v1 = v1;
    }

    public Integer getV2() {
        return v2;
    }

    public void setV2(Integer v2) {
        this.v2 = v2;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }
}
