package com.uff.sem_barreiras.controller;

import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Estado;
import com.uff.sem_barreiras.service.EstadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;

@RestController
public class EstadoController {
    
    // mapeamento Get para listar todos os estados
    @GetMapping("/estado")
    public Page<Estado> listarEstados(
        @And( value = {	@Spec( path = "uf", spec = Equal.class )} ) final Specification<Estado> spec,
		@PageableDefault( size = 26, sort = "uf" ) final Pageable page
    ){
        return this.estadoService.listarEstados(spec, page);
    }

    //mapeamento Get para recuperar 1 estado informando o id do mesmo
    @GetMapping("/estado/{id}")
    public Estado encontrarEstado(@PathVariable( value = "id" ) final Integer id) throws NotFoundException{
        return this.estadoService.encontrarEstado(id);
    }

    @Autowired
    private EstadoService estadoService;
}
