package com.uff.sem_barreiras.dao;

import com.uff.sem_barreiras.model.AreaAtuacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AreaAtuacaoDao extends JpaRepository<AreaAtuacao,Integer>, JpaSpecificationExecutor<AreaAtuacao> {
    
}
