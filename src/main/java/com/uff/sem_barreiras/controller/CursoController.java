package com.uff.sem_barreiras.controller;

import com.uff.sem_barreiras.dto.ResponseObject;
import com.uff.sem_barreiras.exceptions.IdNullException;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Curso;
import com.uff.sem_barreiras.service.CursoService;

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

import net.kaczmarzyk.spring.data.jpa.domain.LessThanOrEqual;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;

@RestController
public class CursoController {
    @GetMapping("/curso")
    public Page<Curso> listarCursos(
        @And( value = {	@Spec( path = "preco", params = "precoMinimo", spec = LessThanOrEqual.class  ),
                        @Spec( path = "nome", spec = Like.class)} ) final Specification<Curso> spec,
		@PageableDefault( size = 50, sort = "nome" ) final Pageable page
    ){ 
        return this.cursoService.listarCursos(spec, page);
    }

    @PostMapping("/curso")
    public Curso cadastrarCurso(@RequestBody  final Curso curso)throws InsertException{
        return this.cursoService.criarCurso(curso);
    }

    @GetMapping("/curso/{id}")
    public ResponseObject encontrarCurso(@PathVariable( value = "id" ) final Integer id)throws NotFoundException{
        this.cursoService.encontrarCurso(id);
        return new ResponseObject(true, "Vaga removida com sucesso");
    }
    
    @DeleteMapping("/curso/{id}")
    public void deletarCurso(@PathVariable(value = "id")Integer id) throws NotFoundException{
        this.cursoService.deletarCurso(id);
    }

     // mapeamento Put para recuperar 1 curso informando o id do mesmo
     @PutMapping("/curso/alterar")
     public Curso alterarcurso(@RequestBody final Curso curso) throws NotFoundException, IdNullException {
        return this.cursoService.alterarCurso(curso);
     }
    
    @Autowired
    private CursoService cursoService ;
}
