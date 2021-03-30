package com.uff.sem_barreiras.dao;

import com.uff.sem_barreiras.model.Candidato;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoDao extends  JpaRepository<Candidato,Integer> {

    @Query( value = "SELECT COUNT(*) FROM candidato WHERE email=:email", nativeQuery = true )
	Integer countByEmail( @Param( "email" ) String email );
    
}
