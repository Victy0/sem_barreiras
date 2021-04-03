package com.uff.sem_barreiras.service;

import com.uff.sem_barreiras.dao.EscolaridadeDao;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Escolaridade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;


@Service
public class EscolaridadeService {

    public Page<Escolaridade> listarEscolaridades( Specification<Escolaridade> spec, final Pageable page ){
        return this.escolaridadeDao.findAll( spec, page);
    }

    public Escolaridade encontrarEscolaridade(Integer id) throws NotFoundException{
        try{
            return this.escolaridadeDao.findById(id).get();
        }catch(final Exception e ){
            throw new NotFoundException("Escolaridade", id);
        }
    }

    @Autowired
    private EscolaridadeDao escolaridadeDao;
}
