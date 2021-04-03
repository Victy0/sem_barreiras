package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.EscolaridadeDao;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Escolaridade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EscolaridadeService {

    public List<Escolaridade> listarEscolaridades(){
        return this.escolaridadeDao.findAll();
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
