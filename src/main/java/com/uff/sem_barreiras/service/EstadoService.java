package com.uff.sem_barreiras.service;

import com.uff.sem_barreiras.dao.EstadoDao;
import com.uff.sem_barreiras.exceptions.NotFoundException;
import com.uff.sem_barreiras.model.Estado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

@Service
public class EstadoService {
    
    // listar todos os estados
    public Page<Estado> listarEstados( Specification<Estado> spec, final Pageable page ){
        return this.estadoDao.findAll(spec, page);
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
