package com.uff.sem_barreiras.service;

import com.uff.sem_barreiras.dao.DeficienciaDao;
import com.uff.sem_barreiras.exceptions.IdNullException;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Deficiencia;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class DeficienciaService {

    // listar todos os deficiencias
    public Page<Deficiencia> listarDeficiencias(Specification<Deficiencia> spec, final Pageable page) {
        return this.deficienciaDao.findAll( spec, page);
    }

    // encontrar deficiencia pelo id
    public Deficiencia encontrarDeficiencia(Integer id) throws NotFoundException {
        try{
            return this.deficienciaDao.findById(id).get();
        }catch(final Exception e ){
            throw new NotFoundException("Deficiência", id);
        }
    }

    // salvar deficiencia
    public Deficiencia criarDeficiencia(Deficiencia deficiencia) throws InsertException {
        try{
            return this.deficienciaDao.save(deficiencia);
        }catch(Exception e){
            throw new InsertException("a Deficiencia");
        }
    }

    // deletar deficiencia
    public void deletarDeficiencia(Integer id) throws NotFoundException {
        
        try{
            this.deficienciaDao.deleteById(id);
        }catch(final Exception e ){
            throw new NotFoundException("Deficiência", id);
        }
    }

    // alterar deficiencia
    public Deficiencia alterarDeficiencia(Deficiencia deficiencia) throws IdNullException{
        if(deficiencia.getId() == null){
            throw new IdNullException("Deficiência");
        }
        this.deficienciaDao.save(deficiencia);
        return this.deficienciaDao.findById(deficiencia.getId()).get();
    }

    @Autowired
    private DeficienciaDao deficienciaDao;
}
