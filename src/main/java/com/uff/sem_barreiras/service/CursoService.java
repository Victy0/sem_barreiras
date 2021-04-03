package com.uff.sem_barreiras.service;

import com.uff.sem_barreiras.dao.CursoDao;
import com.uff.sem_barreiras.exceptions.IdNullException;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    public Page<Curso> listarCursos( Specification<Curso> spec, final Pageable page ){
        return this.cursoDao.findAll(spec, page);
    }

    public Curso criarCurso(Curso curso)throws InsertException{
        try{
           return this.cursoDao.save(curso);
        }catch(final Exception e){
            throw new InsertException("o Curso");
        }
    }

    public Curso encontrarCurso(Integer id) throws NotFoundException {
        try{
            return this.cursoDao.findById(id).get();
        }catch(final Exception e){
            throw new NotFoundException("Curso", id);
        }
    }
    
    public void deletarCurso(Integer id) throws NotFoundException{  
        try{
            this.cursoDao.deleteById(id);
        }catch(final Exception e ){
            throw new NotFoundException("Curso", id);
        }
    }

    // alterar curso
    public Curso alterarCurso(Curso curso) throws IdNullException{
        if(curso.getId() == null){
            throw new IdNullException("Curso");
        }
        this.cursoDao.save(curso);
        return this.cursoDao.findById(curso.getId()).get();
    }

    @Autowired
    private CursoDao cursoDao;
}
