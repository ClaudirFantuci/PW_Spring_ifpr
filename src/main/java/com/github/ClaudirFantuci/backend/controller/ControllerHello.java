package com.github.ClaudirFantuci.backend.controller;

import com.github.ClaudirFantuci.backend.model.Calculadora;
import com.github.ClaudirFantuci.backend.service.ServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerHello {
    @Autowired
    private ServiceHello serviceHello;
    @GetMapping("/")
    public String hello(){
        return "olá spring";
    }
    @GetMapping("/somar")
    public Integer somar(@RequestParam("v1") Integer v1, @RequestParam("v2") Integer v2){
        return v1 + v2;
    }
    @PostMapping("/somar")
    public Calculadora somar(@RequestBody Calculadora calculadora){
        return serviceHello.somar(calculadora);
    }
}
