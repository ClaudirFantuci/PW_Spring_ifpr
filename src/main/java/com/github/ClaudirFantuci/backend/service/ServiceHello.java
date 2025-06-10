package com.github.ClaudirFantuci.backend.service;

import com.github.ClaudirFantuci.backend.model.Calculadora;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class ServiceHello {

    public Calculadora somar(@RequestBody Calculadora calculadora){
        calculadora.setResultado(calculadora.getV1() + calculadora.getV2());
        return calculadora;
    }
}
