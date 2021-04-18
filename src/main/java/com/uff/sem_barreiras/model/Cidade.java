package com.uff.sem_barreiras.model;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
@Table(name= "cidade")
public class Cidade{
 
    @Id
    @Column(name= "id")
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private  Integer id;

    @Column(name= "nome")
    private  String nome;

    @ManyToOne
    @JoinColumn(name= "id_estado")
    private  Estado estado;
}
