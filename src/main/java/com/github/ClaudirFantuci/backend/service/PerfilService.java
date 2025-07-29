package com.github.ClaudirFantuci.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.ClaudirFantuci.backend.model.Perfil;
import com.github.ClaudirFantuci.backend.repository.PerfilRepository;

@Service
public class PerfilService {
    @Autowired
    private PerfilRepository perfilRepository;

    public Perfil inserir(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    public Perfil alterar(Perfil perfil) {

        Perfil perfilBanco = buscarPorId(perfil.getId());
        perfilBanco.setNome(perfil.getNome());
        return perfilRepository.save(perfilBanco);
    }

    public void remover(Long id) {
        Perfil perfilBanco = buscarPorId(id);
        perfilRepository.delete(perfilBanco);
    }

    public Perfil buscarPorId(Long id) {
        return perfilRepository.findById(id)
                .orElseThrow();
    }

    public List<Perfil> buscarTodos() {
        return perfilRepository.findAll();
    }
}
