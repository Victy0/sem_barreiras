package com.uff.sem_barreiras.dao;

import com.uff.sem_barreiras.model.Cidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeDao extends JpaRepository<Cidade, Integer> {

}