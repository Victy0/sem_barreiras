package com.uff.sem_barreiras.dao;

import com.uff.sem_barreiras.model.Deficiencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DeficienciaDao extends JpaRepository<Deficiencia, Integer>, JpaSpecificationExecutor<Deficiencia>  {

}