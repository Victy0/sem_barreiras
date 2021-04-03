package com.uff.sem_barreiras.dao;

import com.uff.sem_barreiras.model.Estado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoDao extends JpaRepository<Estado,Integer>, JpaSpecificationExecutor<Estado> {

}