package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Escolaridade;
import com.uff.sem_barreiras.service.EscolaridadeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EscolaridadeController {

    // mapeamento Get para listar todos as escolaridades
    @GetMapping("/escolaridade")
    public List <Escolaridade> listarEscolaridades(){
        
        return this.escolaridadeService.listarEscolaridades();
    } 
    
    //mapeamento Get para recuperar 1 estado informando o id do mesmo
    @GetMapping("/escolaridade/{id}")
    public Escolaridade encontrarEscolaridade(@PathVariable( value = "id" ) final Integer id) throws NotFoundException{
        try{
            return this.escolaridadeService.encontrarEscolaridade(id);
        }catch(final Exception e ){
            throw new NotFoundException("Escolaridade");
        }
    }
    
    @Autowired
    private EscolaridadeService escolaridadeService ;
}
