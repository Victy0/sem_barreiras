package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.dto.CandidatoDados;
import com.uff.sem_barreiras.dto.ResponseObject;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Vaga;
import com.uff.sem_barreiras.service.VagaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VagaController {
    @GetMapping("/vaga")
    public List <Vaga> listarCursos(){
        
        return this.vagaService.listarVagas();
    }

    @GetMapping("/vaga/{id}")
    public Vaga encontrar(@PathVariable( value = "id" ) final Integer id)throws NotFoundException{
        return this.vagaService.encontrarVaga(id);
    }

    @PostMapping("/vaga") 
    public ResponseObject cadastrar(@RequestBody final Vaga vaga  ) throws InsertException{
        this.vagaService.criarVaga(vaga);
        return new ResponseObject(true, "Vaga salva com sucesso");
    }
    
    @DeleteMapping("/vaga/{id}")
    public ResponseObject deletar(@PathVariable(value = "id")Integer id){
        this.vagaService.deletarVaga(id);
        return new ResponseObject(true, "Vaga removida com sucesso");
    }

    @PostMapping("/vaga/candidatar/{id}")
    public ResponseObject candidatarAVaga(@RequestBody CandidatoDados candidato, @PathVariable(value = "id")Integer idVaga) throws NotFoundException{
        this.vagaService.realizarCandidatura(candidato.getNome(), candidato.getEmail(), candidato.getTelefone(), idVaga);
        return new ResponseObject(true, "Candidatura realizada com sucesso");
    }

    @Autowired
    private VagaService vagaService ;
}
