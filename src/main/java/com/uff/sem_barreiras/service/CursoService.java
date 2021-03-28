package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.CursoDao;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    public List<Curso> listarCursos(){
        return this.cursoDao.findAll();
    }
    public Curso criarCurso(Curso curso)throws InsertException{
        try{
           return this.cursoDao.save(curso);
        }catch(final Exception e){
            String text = e.getMessage().substring(e.getMessage().indexOf("constraint [") + 12, e.getMessage().indexOf("\""));
            throw new InsertException(text, "o Curso");
        }
    }
    public Curso encontrarCurso(Integer id) throws NotFoundException {
       try{
        return this.cursoDao.findById(id).get();
       }catch(final Exception e){
        throw new NotFoundException("Curso", id);
       }
    }
    
    public void deletarCurso(Integer id){
        this.cursoDao.deleteById(id);;
    }
    @Autowired
    private CursoDao cursoDao;
}
