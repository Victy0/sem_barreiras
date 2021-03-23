package com.uff.semBarreiras.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="empresa")
@Data
public class Empresa implements Serializable{
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Integer id;
    
    @Column( name = "nome" )
    private String nome;
    
    @Column( name = "nomeFantasia" )
    private String nomeFantasia;
    
    @Column( name = "cnpj" )
    private String cnpj;
    
    @Column( name = "email" )
    private String email;
    
    @Column( name = "id" )
    private String endereco;
    
    @ManyToOne
    @JoinColumn( name = "id_cidade")
    private Cidade cidade;
}
