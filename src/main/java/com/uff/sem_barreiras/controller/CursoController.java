package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.exceptions.IdNullException;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Curso;
import com.uff.sem_barreiras.service.CursoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    @GetMapping("/curso")
    public List <Curso> listarCursos(){ 
        return this.cursoService.listarCursos();
    }

    @PostMapping("/curso")
    public void cadastrarCurso(@RequestBody  final Curso curso)throws InsertException{
        this.cursoService.criarCurso(curso);
    }

    @GetMapping("/curso/{id}")
    public Curso encontrarCurso(@PathVariable( value = "id" ) final Integer id)throws NotFoundException{
        
        return this.cursoService.encontrarCurso(id);
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
