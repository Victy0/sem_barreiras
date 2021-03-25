package com.uff.sem_barreiras.dao;
import java.util.List;


import com.uff.sem_barreiras.model.Vaga;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VagaDao extends  JpaRepository<Vaga,Integer> {
    
}
