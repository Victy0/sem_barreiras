package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.AreaAtuacaoDao;
import com.uff.sem_barreiras.exceptions.IdNullException;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uff.sem_barreiras.model.AreaAtuacao;

@Service
public class AreaAtuacaoService {

    public List<AreaAtuacao> listarAreaAtuacao(){
        return this.areaAtuacaoDao.findAll();
    }

    public AreaAtuacao encontrarAreaAtuacao(Integer id) throws NotFoundException{
        try{
            return this.areaAtuacaoDao.findById(id).get();
        }catch(final Exception e ){
            throw new NotFoundException("Área de atuação", id);
        }
    }

    public AreaAtuacao criarAreaAtuacao(AreaAtuacao area) throws InsertException{
        try{
            this.areaAtuacaoDao.save(area);
        }catch(final Exception e){
            String text = e.getMessage().substring(e.getMessage().indexOf("constraint [") + 12, e.getMessage().indexOf("\""));
            throw new InsertException(text, "a Área de atuação");
        }
        return this.areaAtuacaoDao.findById(area.getId()).get();
    }

    public void deletarAreaAtuacao(Integer id) throws NotFoundException{
        try{
            this.areaAtuacaoDao.deleteById(id);
        }catch(final Exception e ){
            throw new NotFoundException("Área de atuação", id);
        }
    }

    // alterar area
    public AreaAtuacao alterarAreaAtuacao(AreaAtuacao area) throws IdNullException{
        if(area.getId() == null){
            throw new IdNullException("Área de atuação");
        }
        this.areaAtuacaoDao.save(area);
        return this.areaAtuacaoDao.findById(area.getId()).get();
    }

    @Autowired
    private AreaAtuacaoDao areaAtuacaoDao;
}
