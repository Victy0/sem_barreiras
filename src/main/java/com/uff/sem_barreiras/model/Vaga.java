package com.uff.sem_barreiras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;
import java.util.Date;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Table(name="vaga")
@Data
public class Vaga {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id" )
    private Integer id;
    
    @Column( name = "resumo" )
    private String resumo;
    
    @Column( name = "data_criacao" )
    private Date dataCriacao;

    @Column( name = "remuneracao" )
    private Double remuneracao;
    
    @Column( name = "funcao" )
    private String funcao;
    
    @Column( name = "nivel" )
    private String nivel;
    
    @Column( name = "descricao" )
    private String descricao;
    
    @Column( name = "requisitos_necessarios" )
    private String requisitosNecessarios;
    
    @Column( name = "requisitos_desejados" )
    private String requisitosDesejados;
    
    @Column( name = "beneficios" )
    private String beneficios;
    
    @Column( name = "jornada_trabalho" )
    private String jornadaTrabalho;
    
    @Column( name = "duracao_vaga" )
    private Integer duracaoVaga;
    
    @ManyToOne
    @JoinColumn( name = "id_empresa")
    private Empresa empresa;
    
    @ManyToOne
    @JoinColumn( name = "id_area_atuacao")
    private AreaAtuacao area;
    
    @ManyToOne
    @JoinColumn( name = "id_escolaridade")
    private Escolaridade escolaridade;
    
    @ManyToMany( fetch=FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JsonIgnoreProperties({"vagas"})
    @JoinTable( name = "vaga_x_curso", joinColumns = @JoinColumn( name = "id_vaga" ), inverseJoinColumns = @JoinColumn( name = "id_curso" ) )
    private List<Curso> cursos;  
    
    @ManyToMany( fetch=FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinTable( name = "vaga_x_deficiencia", joinColumns = @JoinColumn( name = "id_vaga" ), inverseJoinColumns = @JoinColumn( name = "id_deficiencia" ) )
    private List<Deficiencia> deficiencias;

}
