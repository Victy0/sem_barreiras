package com.uff.sem_barreiras.controller;

import java.util.List;

import com.uff.sem_barreiras.model.Curso;
import com.uff.sem_barreiras.service.CursoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    @GetMapping("/curso")
    public List <Curso> listarCursos(){
        
        return this.cursoService.listarCursos();
    }
    @PostMapping("/curso")
    public void cadastrarCurso(@RequestBody  final Curso curso){
        this.cursoService.criarCurso(curso);
    }
    
    @DeleteMapping("/curso/{id}")
    public void deletarCurso(@RequestParam(value = "id")Integer id){
        this.cursoService.deletarCurso(id);
    }
    @Autowired
    private CursoService cursoService ;
}
