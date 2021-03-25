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
    public void criarCurso(AreaAtuacao area){
        this.AreaAtuacaoDao.save(area);
    }
    public void deletarCurso(Integer id){
        this.AreaAtuacaoDao.deleteById(id);;
    }
    @Autowired
    private AreaAtuacaoDao AreaAtuacaoDao;
}
