package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.CidadeDao;
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
    public Cidade encontrarCidade(Integer id) {
        return this.cidadeDao.findById(id).get();
    }

    // salvar cidade
    public Cidade criarCidade(Cidade cidade) {
        return this.cidadeDao.save(cidade);
    }

    @Autowired
    private CidadeDao cidadeDao;
}
