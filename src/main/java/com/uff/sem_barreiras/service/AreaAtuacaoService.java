package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.AreaAtuacaoDao;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uff.sem_barreiras.model.AreaAtuacao;

@Service
public class AreaAtuacaoService {

    public List<AreaAtuacao> listarAreaAtuacao(){
        return this.AreaAtuacaoDao.findAll();
    }

    public AreaAtuacao encontrarAreaAtuacao(Integer id) throws NotFoundException{
        try{
            return this.AreaAtuacaoDao.findById(id).get();
        }catch(final Exception e ){
            throw new NotFoundException("Área de atuação", id);
        }
    }

    public AreaAtuacao criarAreaAtuacao(AreaAtuacao area) throws InsertException{
        try{
            return this.AreaAtuacaoDao.save(area);
        }catch(final Exception e){
            String text = e.getMessage().substring(e.getMessage().indexOf("constraint [") + 12, e.getMessage().indexOf("\""));
            throw new InsertException(text, "a Área de atuação");
        }
    }

    public void deletarAreaAtuacao(Integer id) throws NotFoundException{
        try{
            this.AreaAtuacaoDao.deleteById(id);
        }catch(final Exception e ){
            throw new NotFoundException("Área de atuação", id);
        }
    }

    @Autowired
    private AreaAtuacaoDao AreaAtuacaoDao;
}
