package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.model.AreaAtuacao;
import com.uff.sem_barreiras.service.AreaAtuacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaAtuacaoController {

    // mapeamento get para listar todas as areas de atuação
    @GetMapping("/area")
    public List <AreaAtuacao> listarAreas(){ 
        return this.AreaAtuacaoService.listarAreaAtuacao();
    }

    // mapeamento get para encontrar a area de atuação pelo id
    @GetMapping("/area/{id}")
    public AreaAtuacao encontrarAreas(@PathVariable(value = "id")Integer id){ 
        return this.AreaAtuacaoService.encontrarAreaAtuacao(id);
    }

    // mapeamento post para criar nova area deatuação
    @PostMapping(value = "/area")
    public AreaAtuacao cadastrarAreaAtuacao(@RequestBody  final AreaAtuacao area){
        return this.AreaAtuacaoService.criarAreaAtuacao(area);
    }
    
    // mapeamento post para criar nova area deatuação
    @DeleteMapping("/area/{id}")
    public void deletarAreaAtuacao(@PathVariable(value = "id")Integer id){
        this.AreaAtuacaoService.deletarAreaAtuacao(id);
    }

    @Autowired
    private AreaAtuacaoService AreaAtuacaoService ;
}
