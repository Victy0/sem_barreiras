package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.EstadoDao;
import com.uff.sem_barreiras.model.Estado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoService {
    
    // listar todos os estados
    public List<Estado> listarEstados(){
        return this.estadoDao.findAll();
    }

    @Autowired
    private EstadoDao estadoDao;
}
