package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.CidadeDao;
import com.uff.sem_barreiras.exceptions.IdNullException;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Cidade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CidadeService {

    // listar todos os cidades
    public List<Cidade> listarCidades() {
        return this.cidadeDao.findAll();
    }

    // encontrar cidade pelo id
    public Cidade encontrarCidade(Integer id) throws NotFoundException {
        try{
            return this.cidadeDao.findById(id).get();
        }catch(final Exception e ){
            throw new NotFoundException("Cidade", id);
        }
    }

    // salvar cidade
    public Cidade criarCidade(Cidade cidade) throws InsertException {
        try{
            this.cidadeDao.save(cidade);
        }catch(Exception e){
            String text = e.getMessage().substring(e.getMessage().indexOf("constraint [") + 12, e.getMessage().indexOf("\""));
            throw new InsertException(text, "a Cidade");
        }
        return this.cidadeDao.findById(cidade.getId()).get();
    }

    // alterar cidade
    public Cidade alterarCidade(Cidade cidade) throws IdNullException{
        if(cidade.getId() == null){
            throw new IdNullException("Cidade");
        }
        this.cidadeDao.save(cidade);
        return this.cidadeDao.findById(cidade.getId()).get();
    }

    @Autowired
    private CidadeDao cidadeDao;
}
