package com.github.ClaudirFantuci.backend.controller;

import java.util.List;
import com.github.ClaudirFantuci.backend.model.Perfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.ClaudirFantuci.backend.service.PerfilService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/perfil")
public class PerfilController {
 
    @Autowired
    private PerfilService perfilService;

    @GetMapping
    public ResponseEntity<List<Perfil>> buscarTodos() {
        return ResponseEntity.ok(perfilService.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<Perfil> inserir(@Valid @RequestBody Perfil perfil) {
        return ResponseEntity.ok(perfilService.inserir(perfil));
    }

    @PutMapping
    public ResponseEntity<Perfil> alterar(@Valid @RequestBody Perfil perfil) {
        return ResponseEntity.ok(perfilService.alterar(perfil));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> excluir(@PathVariable("id") long id) {
        perfilService.remover(id);
        return ResponseEntity.ok("Removido");
    }
}