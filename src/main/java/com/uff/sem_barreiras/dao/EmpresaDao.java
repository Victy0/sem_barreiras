package com.uff.sem_barreiras.dao;

import com.uff.sem_barreiras.model.Empresa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaDao extends JpaRepository<Empresa, Integer> {

}