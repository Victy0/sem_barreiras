package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.dto.ResponseObject;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
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
    public AreaAtuacao encontrarAreas(@PathVariable(value = "id")Integer id) throws NotFoundException{ 
        return this.AreaAtuacaoService.encontrarAreaAtuacao(id);
    }

    // mapeamento post para criar nova area deatuação
    @PostMapping(value = "/area")
    public ResponseObject cadastrarAreaAtuacao(@RequestBody  final AreaAtuacao area) throws InsertException{
        this.AreaAtuacaoService.criarAreaAtuacao(area);
        return new ResponseObject(true, "Área de atuação alterada com sucesso");
    }
    
    // mapeamento post para criar nova area deatuação
    @DeleteMapping("/area/{id}")
    public ResponseObject deletarAreaAtuacao(@PathVariable(value = "id")Integer id) throws NotFoundException{
        this.AreaAtuacaoService.deletarAreaAtuacao(id);
        return new ResponseObject(true, "Área de atuação removida com sucesso");
    }

    @Autowired
    private AreaAtuacaoService AreaAtuacaoService ;
}
