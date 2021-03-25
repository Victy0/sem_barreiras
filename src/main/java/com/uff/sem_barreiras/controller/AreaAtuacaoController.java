package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.model.AreaAtuacao;
import com.uff.sem_barreiras.service.AreaAtuacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaAtuacaoController {
    @GetMapping("/area")
    public List <AreaAtuacao> listarArea(){
        
        return this.AreaAtuacaoService.listarAreaAtuacao();
    }
    @PostMapping("/area")
    public void cadastrarAreaAtuacao(@RequestBody  final AreaAtuacao area){
        this.AreaAtuacaoService.criarCurso(area);
    }
    
    @DeleteMapping("/area/{id}")
    public void deletarAreaAtuacao(@RequestParam(value = "id")Integer id){
        this.AreaAtuacaoService.deletarCurso(id);
    }
    @Autowired
    private AreaAtuacaoService AreaAtuacaoService ;
}
