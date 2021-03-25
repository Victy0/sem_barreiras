package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.CursoDao;
import com.uff.sem_barreiras.model.Curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    public List<Curso> listarCursos(){
        return this.cursoDao.findAll();
    }
    public void criarCurso(Curso curso){
        this.cursoDao.save(curso);
    }
    public void deletarCurso(Integer id){
        this.cursoDao.deleteById(id);;
    }
    @Autowired
    private CursoDao cursoDao;
}
