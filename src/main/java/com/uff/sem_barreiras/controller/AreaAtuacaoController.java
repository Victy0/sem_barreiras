package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.dto.ResponseObject;
import com.uff.sem_barreiras.exceptions.IdNullException;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.AreaAtuacao;
import com.uff.sem_barreiras.service.AreaAtuacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaAtuacaoController {

    // mapeamento get para listar todas as areas de atuação
    @GetMapping("/area")
    public List <AreaAtuacao> listarAreas(){ 
        return this.areaAtuacaoService.listarAreaAtuacao();
    }

    // mapeamento get para encontrar a area de atuação pelo id
    @GetMapping("/area/{id}")
    public AreaAtuacao encontrarAreas(@PathVariable(value = "id")Integer id) throws NotFoundException{ 
        return this.areaAtuacaoService.encontrarAreaAtuacao(id);
    }

    // mapeamento post para criar nova area deatuação
    @PostMapping(value = "/area")
    public AreaAtuacao cadastrarAreaAtuacao(@RequestBody final AreaAtuacao area) throws InsertException{
        return this.areaAtuacaoService.criarAreaAtuacao(area);
    }
    
    // mapeamento post para criar nova area de atuação
    @DeleteMapping("/area/{id}")
    public ResponseObject deletarAreaAtuacao(@PathVariable(value = "id")Integer id) throws NotFoundException{
        this.areaAtuacaoService.deletarAreaAtuacao(id);
        return new ResponseObject(true, "Área de atuação removida com sucesso");
    }

     // mapeamento Put para alterar area de atuação
     @PutMapping("/area/alterar")
     public AreaAtuacao alterarCidade(@RequestBody final AreaAtuacao area) throws NotFoundException, IdNullException {
         return this.areaAtuacaoService.alterarAreaAtuacao(area);
     }

    @Autowired
    private AreaAtuacaoService areaAtuacaoService ;
}
