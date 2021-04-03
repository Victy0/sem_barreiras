package com.uff.sem_barreiras.controller;

import com.uff.sem_barreiras.dto.ResponseObject;
import com.uff.sem_barreiras.exceptions.IdNullException;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Cidade;
import com.uff.sem_barreiras.service.CidadeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;

@RestController
public class CidadeController {

    // mapeamento Get para listar todos os cidades
    @GetMapping("/cidade")
    public Page<Cidade> listarCidades(
        @And( value = {	@Spec( path = "estado.id", params = "estado", spec = Equal.class ),
                        @Spec( path = "nome", spec = Like.class)} ) final Specification<Cidade> spec,
		@PageableDefault( size = 50, sort = "nome" ) final Pageable page
    ) {
        return this.cidadeService.listarCidades(spec, page);
    }

    // mapeamento Get para recuperar 1 cidade informando o id do mesmo
    @GetMapping("/cidade/{id}")
    public Cidade encontrarCidade(@PathVariable(value = "id") final Integer id) throws NotFoundException {
        return this.cidadeService.encontrarCidade(id);
    }

    // mapeamento Post para criar uma cidade
    @PostMapping("/cidade")
    public Cidade criarCidade(@RequestBody final Cidade cidade) throws InsertException{
        return this.cidadeService.criarCidade(cidade);
    }

    // mapeamento Put para alterar cidade
    @PutMapping("/cidade/alterar")
    public Cidade alterarCidade(@RequestBody final Cidade cidade) throws NotFoundException, IdNullException {
        return this.cidadeService.alterarCidade(cidade);
    }
    //mapeamento Delete para deletar cidade
    @DeleteMapping("/cidade/{id}")
    public ResponseObject deletarAreaAtuacao(@PathVariable(value = "id")Integer id) throws NotFoundException{
        this.cidadeService.deletarCidade(id);
        return new ResponseObject(true, " Cidade removida com sucesso");
    }

    @Autowired
    private CidadeService cidadeService;
}
