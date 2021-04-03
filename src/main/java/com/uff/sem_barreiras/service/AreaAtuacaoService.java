package com.uff.sem_barreiras.service;

import com.uff.sem_barreiras.dao.AreaAtuacaoDao;
import com.uff.sem_barreiras.exceptions.IdNullException;
import com.uff.sem_barreiras.exceptions.InsertException;
import com.uff.sem_barreiras.exceptions.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import com.uff.sem_barreiras.model.AreaAtuacao;

@Service
public class AreaAtuacaoService {

    public Page<AreaAtuacao> listarAreaAtuacao(Specification<AreaAtuacao> spec, final Pageable page){
        return this.areaAtuacaoDao.findAll(spec, page);
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
            throw new InsertException("a Área de atuação");
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
