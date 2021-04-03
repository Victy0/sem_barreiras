package com.uff.sem_barreiras.dao;

import com.uff.sem_barreiras.model.Vaga;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaDao extends  JpaRepository<Vaga,Integer>, JpaSpecificationExecutor<Vaga> {
    
}
