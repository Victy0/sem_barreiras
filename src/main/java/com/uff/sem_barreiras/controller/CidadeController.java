package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Cidade;
import com.uff.sem_barreiras.service.CidadeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CidadeController {

    // mapeamento Get para listar todos os cidades
    @GetMapping("/cidade")
    public List<Cidade> listarCidades() {
        return this.cidadeService.listarCidades();
    }

    // mapeamento Get para recuperar 1 cidade informando o id do mesmo
    @GetMapping("/cidade/{id}")
    public Cidade encontrarCidade(@PathVariable(value = "id") final Integer id) throws NotFoundException {
        try {
            return this.cidadeService.encontrarCidade(id);
        } catch (final Exception e) {
            throw new NotFoundException("Cidade");
        }
    }

    // mapeamento Post para criar uma cidade
    @PostMapping("/cidade")
    public Cidade criarCidade(@RequestBody final Cidade cidade) {
        return this.cidadeService.criarCidade(cidade);
    }

    @Autowired
    private CidadeService cidadeService;
}
