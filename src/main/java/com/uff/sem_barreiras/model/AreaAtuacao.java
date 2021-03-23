package com.uff.semBarreiras.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="area_atuacao")
@Data
public class AreaAtuacao implements Serializable {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Integer id;
    
    @Column( name = "descricao" )
    private String descricao;
    
    @Column( name = "nome" )
    private Integer nome;
}
