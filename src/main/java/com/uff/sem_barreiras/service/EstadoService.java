package com.uff.sem_barreiras.service;

import java.util.List;

import com.uff.sem_barreiras.dao.EstadoDao;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Estado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class EstadoService {
    
    // listar todos os estados
    public List<Estado> listarEstados(){
        return this.estadoDao.findAll();
    }

    // encontrar estado pelo id
    public Estado encontrarEstado(Integer id) throws NotFoundException{
        try{
            return this.estadoDao.findById(id).get();
        }catch(final Exception e ){
            throw new NotFoundException("Estado", id);
        }
    }

    @Autowired
    private EstadoDao estadoDao;
}
