package com.uff.sem_barreiras.dao;

import java.util.List;

import com.uff.sem_barreiras.model.Vaga;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaDao extends  JpaRepository<Vaga,Integer>, JpaSpecificationExecutor<Vaga> {

    @Query(value = "SELECT id_vaga FROM vaga WHERE data_criacao > (CURRENT_DATE - INTERVAL '30 DAY')", nativeQuery = true)
	List<Integer> recuperaVagaPassado30Dias();
    
}
