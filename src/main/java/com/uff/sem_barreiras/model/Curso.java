package com.uff.sem_barreiras.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;

@Entity
@Data
@Table(name= "curso")
public class Curso{
    
    @Id
    @Column(name= "id")
    @GeneratedValue( strategy = GenerationType.IDENTITY )    
    private Integer id ;

    @Column(name= "nome")
    private String nome ;

    @Column(name= "descricao")
    private String descricao ;

    @Column(name= "hiperLink")
    private String hyperLink ;

    @Column(name= "preco")
    private Double preco ;

    @ManyToMany( fetch=FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JsonIgnoreProperties({ "curso",
                            "resumo",
                            "dataCriacao",
                            "remuneracao",
                            "funcao",
                            "nivel",
                            "descricao",
                            "requisitosNecessarios",
                            "requisitosDesejados",
                            "beneficios",
                            "jornadaTrabalho",
                            "duracaoVaga"
                        })
    @JoinTable( name = "vaga_x_curso", joinColumns = @JoinColumn( name = "id_curso" ), inverseJoinColumns = @JoinColumn( name = "id_vaga" ) )
    private List<Vaga> vagas ;
}
