package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.model.Vaga;
import com.uff.sem_barreiras.service.VagaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VagaController {
    @GetMapping("/vaga")
    public List <Vaga> listarCursos(){
        
        return this.vagaService.listarVagas();
    }
    @PostMapping("/vaga")
    public void cadastrar(@RequestBody final Vaga vaga  ){
        this.vagaService.criarVaga(vaga);
    }
    
    @DeleteMapping("/vaga")
    public void deletar(@RequestParam(value = "id")Integer id){
        this.vagaService.deletarVaga(id);
    }
    @Autowired
    private VagaService vagaService ;
}
