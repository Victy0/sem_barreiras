package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.exceptions.InsertException;
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
            throw new NotFoundException("Candidato", id);
        }
    }

    // mapeamento post para cadastrar candidato
    @PostMapping("/candidato")
    public Candidato cadastrar(@RequestBody final Candidato candidato  ) throws InsertException {
        return this.candidatoService.criarCandidato(candidato);
    }

    // mapeamento post para cadastrar candidato
    @PostMapping("/candidato/atualiza")
    public Candidato atualizar(@RequestBody final Candidato candidato  ) {
        return this.candidatoService.atualizarCandidato(candidato);
    }

    // mapeamento get para confirmar candidatura para uma vaga tendo "cadastro"
    @GetMapping("/candidato/{idCandidato}/candidatura/{idVaga}")
    public Boolean atrelarCandidatura(@PathVariable( value = "idCandido" ) final Integer idCandidato, @PathVariable( value = "idVaga" ) final Integer idVaga)throws NotFoundException{
        return this.candidatoService.atrelarCandidatura(idCandidato, idVaga);
    }

    // mapeamento post para confirmar candidatura para uma vaga sem "cadastro"
    @PostMapping("/candidato/candidatura/{idVaga}")
    public Boolean atrelarCandidatura(@RequestBody final String nome, @RequestBody final String email, @RequestBody final String telefone, @PathVariable( value = "idVaga" ) final Integer idVaga)throws NotFoundException{
        return this.candidatoService.realizarCandidatura(nome, email, telefone, idVaga);
    }

    
    @Autowired
    private CandidatoService candidatoService ;
}
