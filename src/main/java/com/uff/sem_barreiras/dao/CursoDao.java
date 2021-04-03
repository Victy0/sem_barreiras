package com.uff.sem_barreiras.dao;

import com.uff.sem_barreiras.model.Curso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoDao extends JpaRepository<Curso,Integer>, JpaSpecificationExecutor<Curso>  {
   
}
