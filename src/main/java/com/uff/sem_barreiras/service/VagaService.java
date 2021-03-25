package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.VagaDao;
import com.uff.sem_barreiras.model.Vaga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VagaService {
    public List<Vaga> listarVagas( ){
        return this.vagaDao.findAll();
    }

    public void criarVaga(Vaga vaga){
        this.vagaDao.save(vaga);
    }
    public void deletarVaga(Integer id){
        this.vagaDao.deleteById(id);;
    }
    @Autowired
    private VagaDao vagaDao;
}
