package com.uff.sem_barreiras.dao;

import com.uff.sem_barreiras.model.Candidato;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoDao extends  JpaRepository<Candidato,Integer> {
    
}
