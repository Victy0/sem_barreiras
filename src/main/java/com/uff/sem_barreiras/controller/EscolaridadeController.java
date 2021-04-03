package com.uff.sem_barreiras.controller;

import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Escolaridade;
import com.uff.sem_barreiras.service.EscolaridadeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;

@RestController
public class EscolaridadeController {

    // mapeamento Get para listar todos as escolaridades
    @GetMapping("/escolaridade")
    public Page<Escolaridade> listarEscolaridades(
        @And( value = {	@Spec( path = "descricao", spec = Like.class)} ) final Specification<Escolaridade> spec,
		@PageableDefault( size = 30, sort = "descricao" ) final Pageable page
    ){ 
        return this.escolaridadeService.listarEscolaridades(spec, page);
    } 
    
    //mapeamento Get para recuperar 1 estado informando o id do mesmo
    @GetMapping("/escolaridade/{id}")
    public Escolaridade encontrarEscolaridade(@PathVariable( value = "id" ) final Integer id) throws NotFoundException{
        return this.escolaridadeService.encontrarEscolaridade(id);
    }
    
    @Autowired
    private EscolaridadeService escolaridadeService ;
}
