package com.uff.sem_barreiras.dao;

import java.util.List;

import com.uff.sem_barreiras.model.Empresa;
import com.uff.sem_barreiras.model.Vaga;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaDao extends JpaRepository<Empresa, Integer>, JpaSpecificationExecutor<Empresa>  {

    @Query(value = "SELECT id FROM empresa WHERE email = :email", nativeQuery = true)
    Integer getIdByEmail(@Param( "email") String email);

    @Query(value = "SELECT * FROM vaga WHERE id_empresa =: id", nativeQuery = true)
    List<Vaga> getVagas(@Param( "id") Integer id);

    @Modifying
    @Query(value = "DELETE FROM vaga WHERE id_empresa =: id", nativeQuery = true)
    void deleteVagasDaEmpresa(@Param( "id" ) Integer id);
}