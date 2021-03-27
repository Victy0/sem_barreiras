package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.AreaAtuacaoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uff.sem_barreiras.model.AreaAtuacao;

@Service
public class AreaAtuacaoService {

    public List<AreaAtuacao> listarAreaAtuacao(){
        return this.AreaAtuacaoDao.findAll();
    }

    public AreaAtuacao encontrarAreaAtuacao(Integer id){
        return this.AreaAtuacaoDao.findById(id).get();
    }

    public AreaAtuacao criarAreaAtuacao(AreaAtuacao area){
        return this.AreaAtuacaoDao.save(area);
    }

    public void deletarAreaAtuacao(Integer id){
        this.AreaAtuacaoDao.deleteById(id);
    }

    @Autowired
    private AreaAtuacaoDao AreaAtuacaoDao;
}
