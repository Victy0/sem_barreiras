package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Candidato;
import com.uff.sem_barreiras.service.CandidatoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidatoController {

    // mapeamento Get para listar todos as candidatos
    @GetMapping("/candidato")
    public List <Candidato> listar(){
        
        return this.candidatoService.listarCandidatos();
    } 
    
    //mapeamento Get para recuperar 1 candidato informando o id do mesmo
    @GetMapping("/candidato/{id}")
    public Candidato encontrar(@PathVariable( value = "id" ) final Integer id) throws NotFoundException{
        try{
            return this.candidatoService.encontrarCandidato(id);
        }catch(final Exception e ){
            throw new NotFoundException("Candidato");
        }
    }

    // mapeamento post para cadastrar candidato
    @PostMapping("/candidato")
    public Candidato cadastrar(@RequestBody final Candidato candidato  ){
        return this.candidatoService.criarCandidato(candidato);
    }

    // mapeamento put para confirmar candidatura para uma vaga
    @PutMapping("/candidato/{idCandidato}/candidatura/{idVaga}")
    public Boolean atrelarCandidatura(@PathVariable( value = "idCandido" ) final Integer idCandidato, @PathVariable( value = "idVaga" ) final Integer idVaga){
        return this.candidatoService.atrelarCandidatura(idCandidato, idVaga);
    }



    
    @Autowired
    private CandidatoService candidatoService ;
}
